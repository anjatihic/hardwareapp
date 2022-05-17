package hr.tvz.tihic.hardwareapp.security.controller;

import hr.tvz.tihic.hardwareapp.security.command.LoginCommand;
import hr.tvz.tihic.hardwareapp.security.dto.LoginDTO;
import hr.tvz.tihic.hardwareapp.security.service.AuthenticationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("authentication")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("login/")
    @CrossOrigin(origins = "http://localhost:4200")
    public LoginDTO login(@Valid @RequestBody final LoginCommand command){
        return authenticationService.login(command)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Credentials"));
    }
}
