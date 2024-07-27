package com.kas_kelas.kas_kelas.services;

import com.kas_kelas.kas_kelas.models.entity.Roles;
import com.kas_kelas.kas_kelas.models.entity.Users;
import com.kas_kelas.kas_kelas.models.repository.RoleRepository;
import com.kas_kelas.kas_kelas.models.repository.UserRepository;
import com.kas_kelas.kas_kelas.requests.UserRequest;
import com.kas_kelas.kas_kelas.response.EmailDoubleException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.UUID;

@Service
public class UserImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    private ModelMapper modelMapper;

    @Override
    public Users createUser(UserRequest userRequest) throws EmailDoubleException {
        try{
            String token = UUID.randomUUID().toString();
            modelMapper = new ModelMapper();
            Users users = modelMapper.map(userRequest, Users.class);
            users.setRole(findRoleByName("user"));
            users.setToken(token);
            return userRepository.save(users);
        }catch (Exception e){
            throw new EmailDoubleException("Email telah terdaftar");
        }
    }

    private Roles findRoleByName(String roleName){
        return roleRepository.findByName(roleName);
    }
}
