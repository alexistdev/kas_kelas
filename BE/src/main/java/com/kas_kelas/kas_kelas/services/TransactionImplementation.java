package com.kas_kelas.kas_kelas.services;

import com.kas_kelas.kas_kelas.models.entity.MonthEntity;
import com.kas_kelas.kas_kelas.models.entity.Transaction;
import com.kas_kelas.kas_kelas.models.repository.MonthRepository;
import com.kas_kelas.kas_kelas.models.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;

@Service
public class TransactionImplementation implements TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private MonthRepository monthRepository;

    @Override
    public Transaction getTransactionData(Long User_id) {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        MonthEntity resultMonth = monthRepository.findByMonth(month,year);
        if(resultMonth != null){
            Transaction resultTransaction = transactionRepository.findByMonthAndUser(resultMonth.getId(),User_id);
            if(resultTransaction != null){
                return resultTransaction;
            }
            return null;
        }
        return null;

    }
}
