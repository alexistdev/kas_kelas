package com.kas_kelas.kas_kelas.models.repository;

import com.kas_kelas.kas_kelas.models.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
