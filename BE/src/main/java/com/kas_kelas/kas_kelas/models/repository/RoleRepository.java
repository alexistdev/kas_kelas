package com.kas_kelas.kas_kelas.models.repository;

import com.kas_kelas.kas_kelas.models.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Integer> {
    Roles findByName(String name);
}
