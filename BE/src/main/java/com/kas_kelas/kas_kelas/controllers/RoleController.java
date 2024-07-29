package com.kas_kelas.kas_kelas.controllers;

import com.kas_kelas.kas_kelas.models.entity.Role;
import com.kas_kelas.kas_kelas.response.ResponseData;
import com.kas_kelas.kas_kelas.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public ResponseEntity<ResponseData<Iterable<Role>>> getAllRoles() {
        ResponseData<Iterable<Role>> responseData = new ResponseData<>();
        Iterable<Role> roles = roleService.getAllRoles();
        if(!roles.iterator().hasNext()){
            responseData.setStatus(true);
            responseData.getMessages().add("Roles found");
            responseData.setPayload(roles);
            return ResponseEntity.ok(responseData);
        }
        responseData.setStatus(false);
        responseData.getMessages().add("No roles found");
        responseData.setPayload(null);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
    }

    @PostMapping
    public ResponseEntity<ResponseData<Role>> addRole(@RequestBody Role role, Errors errors) {
        ResponseData<Role> responseData = new ResponseData<>();
        if (errors.hasErrors()) {
            for (ObjectError error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.getMessages().add("Role added");
        responseData.setPayload(roleService.createRole(role));
        return ResponseEntity.status(HttpStatus.CREATED).body(responseData);
    }
}
