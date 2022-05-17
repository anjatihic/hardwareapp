package hr.tvz.tihic.hardwareapp.security.service;

import hr.tvz.tihic.hardwareapp.security.command.LoginCommand;
import hr.tvz.tihic.hardwareapp.security.dto.LoginDTO;

import java.util.Optional;

public interface AuthenticationService {
    Optional<LoginDTO> login(LoginCommand command);
}
