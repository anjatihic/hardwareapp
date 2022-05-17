package hr.tvz.tihic.hardwareapp.security.service;

import hr.tvz.tihic.hardwareapp.security.domain.User;

public interface JwtService {
    boolean authenticate(String token);
    String createJwt(User user);
}
