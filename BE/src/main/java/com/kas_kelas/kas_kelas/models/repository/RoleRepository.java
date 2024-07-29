package com.kas_kelas.kas_kelas.models.repository;



import com.kas_kelas.kas_kelas.models.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoleRepository  extends CrudRepository<Role, UUID> {

    Role findByName(String name);
}
