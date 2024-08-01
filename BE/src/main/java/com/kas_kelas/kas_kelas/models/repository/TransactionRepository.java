package com.kas_kelas.kas_kelas.models.repository;

import com.kas_kelas.kas_kelas.models.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    @Query(value = "SELECT * FROM transactions t WHERE t.month_id = :monthID AND t.user_id = :userID",
            nativeQuery = true )
    Transaction findByMonthAndUser(@Param("monthID") Long monthId, @Param("userID") Long userId);
}
