package com.kas_kelas.kas_kelas.services;

import com.kas_kelas.kas_kelas.dto.LoginDTO;
import com.kas_kelas.kas_kelas.requests.LoginRequest;

public interface AuthService {

    public LoginDTO check_login(LoginRequest loginRequest);
}
