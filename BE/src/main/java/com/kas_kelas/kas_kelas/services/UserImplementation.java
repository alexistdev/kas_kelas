package com.kas_kelas.kas_kelas.services;

import com.kas_kelas.kas_kelas.dto.LoginDTO;
import com.kas_kelas.kas_kelas.models.entity.Roles;
import com.kas_kelas.kas_kelas.models.entity.Users;
import com.kas_kelas.kas_kelas.models.repository.RoleRepository;
import com.kas_kelas.kas_kelas.models.repository.UserRepository;
import com.kas_kelas.kas_kelas.requests.LoginRequest;
import com.kas_kelas.kas_kelas.requests.UserRequest;
import com.kas_kelas.kas_kelas.response.EmailDoubleException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.List;
import java.util.UUID;

@Service
public class UserImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    private ModelMapper modelMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Users createUser(UserRequest userRequest) throws EmailDoubleException {
        try{
            String token = UUID.randomUUID().toString();
            modelMapper = new ModelMapper();
            Users users = modelMapper.map(userRequest, Users.class);
            users.setPassword(passwordEncoder.encode(userRequest.getPassword()));
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


    @Override
    public LoginDTO check_login(LoginRequest loginRequest) {
        LoginDTO loginDTO = new LoginDTO();
        Users user = userRepository.findByEmail(loginRequest.getEmail());
        try {
            if (user != null && (authenticateLogin(loginRequest.getPassword(),user.getPassword()))) {
                loginDTO.setId(String.valueOf(user.getId()));
                loginDTO.setEmail(user.getEmail());
                loginDTO.setToken(user.getToken());
                loginDTO.setName(user.getName());
                loginDTO.setRoles(user.getRole());
                return loginDTO;
            }
        }catch (Exception e){
            return null;
        }
        return null;
    }

    private boolean authenticateLogin(String password1, String password2) throws Exception {
        return passwordEncoder.matches(password1, password2);
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}
