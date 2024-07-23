package com.kas_kelas.kas_kelas.services;

import com.kas_kelas.kas_kelas.models.entity.Users;
import com.kas_kelas.kas_kelas.models.repository.UserRepository;
import com.kas_kelas.kas_kelas.requests.UserRequest;
import com.kas_kelas.kas_kelas.response.EmailDoubleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users createUser(UserRequest userRequest) throws EmailDoubleException {
        try{
            Users users = new Users();
            users.setName(userRequest.getName());
            users.setPassword(userRequest.getPassword());
            users.setEmail(userRequest.getEmail());
            users.setToken("1231231231322");
            return userRepository.save(users);
        }catch (Exception e){
            throw new EmailDoubleException("Email telah terdaftar");
        }
    }
}
