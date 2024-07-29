package com.kas_kelas.kas_kelas.services;

import com.kas_kelas.kas_kelas.models.entity.Roles;

import java.util.List;

public interface RoleService {

    public Roles createRole(Roles role);


    public Iterable<Roles> getAllRoles();
}
