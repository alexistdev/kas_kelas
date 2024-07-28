package com.kas_kelas.kas_kelas.controllers;

import com.kas_kelas.kas_kelas.models.entity.Users;
import com.kas_kelas.kas_kelas.requests.UserRequest;
import com.kas_kelas.kas_kelas.response.ResponseData;
import com.kas_kelas.kas_kelas.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping
    public ResponseEntity<ResponseData<Users>> registration(@Valid @RequestBody UserRequest user, Errors errors) {
        ResponseData<Users> responseData = new ResponseData<>();
        if(errors.hasErrors()) {
            for (ObjectError error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        try{
            responseData.setStatus(true);
            responseData.setPayload(userService.createUser(user));
            responseData.getMessages().add("User created successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(responseData);
        } catch (Exception e) {
            responseData.setStatus(false);
            responseData.setPayload(null);
            responseData.getMessages().add(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }

    }

    @GetMapping
    public ResponseEntity<ResponseData<List<Users>>> getAllUsers() {
        ResponseData<List<Users>> responseData = new ResponseData<>();
        List<Users> users = userService.getAllUsers();
        responseData.setStatus(true);
        responseData.getMessages().add("All users found");
        responseData.setPayload(users);
        return ResponseEntity.ok(responseData);
    }
}
