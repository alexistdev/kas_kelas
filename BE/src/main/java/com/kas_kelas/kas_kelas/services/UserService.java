package com.kas_kelas.kas_kelas.services;

import com.kas_kelas.kas_kelas.dto.LoginDTO;
import com.kas_kelas.kas_kelas.models.entity.Users;
import com.kas_kelas.kas_kelas.requests.LoginRequest;
import com.kas_kelas.kas_kelas.requests.UserRequest;
import com.kas_kelas.kas_kelas.response.EmailDoubleException;

import java.util.List;

public interface UserService {


    public Users createUser(UserRequest user) throws EmailDoubleException;

    public LoginDTO check_login(LoginRequest loginRequest);

    public List<Users> getAllUsers();
}
