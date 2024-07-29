package com.kas_kelas.kas_kelas.controllers;

import com.kas_kelas.kas_kelas.models.entity.Roles;
import com.kas_kelas.kas_kelas.response.ResponseData;
import com.kas_kelas.kas_kelas.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public ResponseEntity<ResponseData<Iterable<Roles>>> getAllRoles() {
        ResponseData<Iterable<Roles>> responseData = new ResponseData<>();
        Iterable<Roles> roles = roleService.getAllRoles();
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
}
