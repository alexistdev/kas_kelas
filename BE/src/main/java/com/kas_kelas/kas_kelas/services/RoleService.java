package com.kas_kelas.kas_kelas.services;

import com.kas_kelas.kas_kelas.models.entity.Role;

import java.util.List;

public interface RoleService {

    public Role createRole(Role role);


    public List<Role> getAllRoles();
}
