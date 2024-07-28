package com.kas_kelas.kas_kelas.controllers;

import com.kas_kelas.kas_kelas.dto.LoginDTO;
import com.kas_kelas.kas_kelas.requests.LoginRequest;
import com.kas_kelas.kas_kelas.response.ResponseData;
import com.kas_kelas.kas_kelas.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/auth")
public class AuthController {

    @Autowired
    private UserService authService;

    @PostMapping
    public ResponseEntity<ResponseData<LoginDTO>> login(@Valid @RequestBody LoginRequest login, Errors errors) {
        ResponseData<LoginDTO> responseData = new ResponseData<>();
        if (errors.hasErrors()) {
            for (ObjectError error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        LoginDTO result = authService.check_login(login);

        if(result != null) {
            responseData.setPayload(result);
            responseData.setStatus(true);
            return ResponseEntity.ok(responseData);
        }
        responseData.getMessages().add("Username atau password tidak sesuai!");
       return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(responseData);
    }
}
