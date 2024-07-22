package com.kas_kelas.kas_kelas.services;

import com.kas_kelas.kas_kelas.dto.LoginDTO;
import com.kas_kelas.kas_kelas.models.entity.Users;
import com.kas_kelas.kas_kelas.models.repository.UserRepository;
import com.kas_kelas.kas_kelas.requests.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImp implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public LoginDTO check_login(LoginRequest loginRequest)  {
        LoginDTO loginDTO = new LoginDTO();
        Users user = userRepository.findByEmail(loginRequest.getEmail());
        if (user != null) {
            if (user.getPassword().equals(loginRequest.getPassword())) {
                loginDTO.setId(String.valueOf(user.getId()));
                loginDTO.setEmail(user.getEmail());
                loginDTO.setToken(user.getToken());
                return loginDTO;
            }
        }
       return null;
    }
}
