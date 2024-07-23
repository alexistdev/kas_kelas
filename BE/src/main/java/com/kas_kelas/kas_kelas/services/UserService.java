package com.kas_kelas.kas_kelas.services;

import com.kas_kelas.kas_kelas.models.entity.Users;
import com.kas_kelas.kas_kelas.requests.UserRequest;
import com.kas_kelas.kas_kelas.response.EmailDoubleException;

public interface UserService {


    public Users createUser(UserRequest user) throws EmailDoubleException;
}
