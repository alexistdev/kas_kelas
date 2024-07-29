package com.kas_kelas.kas_kelas.services;

import com.kas_kelas.kas_kelas.models.entity.Roles;
import com.kas_kelas.kas_kelas.models.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Roles createRole(Roles role) {
        return roleRepository.save(role);
    }

    @Override
    public Iterable<Roles> getAllRoles() {

        Iterable<Roles> roles = roleRepository.findAll();
        return roles;
    }
}
