package hr.tvz.tihic.hardwareapp.security.service;

import hr.tvz.tihic.hardwareapp.security.command.LoginCommand;
import hr.tvz.tihic.hardwareapp.security.domain.User;
import hr.tvz.tihic.hardwareapp.security.dto.LoginDTO;
import hr.tvz.tihic.hardwareapp.security.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticationServiceImpl implements AuthenticationService{
    private final JwtService jwtService;
    private final UserRepository userRepository;

    public AuthenticationServiceImpl(JwtService jwtService, UserRepository userRepository) {
        this.jwtService = jwtService;
        this.userRepository = userRepository;
    }

    @Override
    public Optional<LoginDTO> login(LoginCommand command){
        Optional<User> user = userRepository.findByUsername(command.getUsername());

        if(user.isEmpty() || !isMatchingPassword(command.getPassword(), user.get().getPassword())){
            return Optional.empty();
        }

        return Optional.of(
                new LoginDTO(jwtService.createJwt(user.get()))
        );
    }

    private boolean isMatchingPassword(String rawPassword, String encryptedPassword){
        //TODO - implementirati provjeru odgovara li lozinka, koju je unio korisnik, enkriptiranoj lozinki u bazi
        return passwordEncoder().matches(rawPassword, encryptedPassword);
        // throw new UnsupportedOperationException();
    }
    @Bean
    private PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
