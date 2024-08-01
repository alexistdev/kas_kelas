package com.kas_kelas.kas_kelas.models.repository;

import com.kas_kelas.kas_kelas.models.entity.MonthEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthRepository extends JpaRepository<MonthEntity, Long> {

    @Query(value = "SELECT * FROM months m WHERE m.month = :monthID AND m.year = :yearNumber  LIMIT 1",
            nativeQuery = true )
    MonthEntity findByMonth(@Param("monthID") int month,@Param("yearNumber") int year);

}
