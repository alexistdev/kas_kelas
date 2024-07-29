package com.kas_kelas.kas_kelas.models.repository;



import com.kas_kelas.kas_kelas.models.entity.Roles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoleRepository  extends CrudRepository<Roles, UUID> {

    Roles findByName(String name);
}
