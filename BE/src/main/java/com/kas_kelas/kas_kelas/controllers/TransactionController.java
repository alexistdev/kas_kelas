package com.kas_kelas.kas_kelas.controllers;

import com.kas_kelas.kas_kelas.dto.TransactionDTO;
import com.kas_kelas.kas_kelas.models.entity.MonthEntity;
import com.kas_kelas.kas_kelas.models.entity.Transaction;
import com.kas_kelas.kas_kelas.models.repository.MonthRepository;
import com.kas_kelas.kas_kelas.response.ResponseData;
import com.kas_kelas.kas_kelas.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@RestController
@RequestMapping("/v1/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private MonthRepository monthRepository;

    @GetMapping("/{user_id}")
    public ResponseEntity<ResponseData<TransactionDTO>> getTransaction(@PathVariable("user_id") Long user_id) {

        ResponseData<TransactionDTO> responseData = new ResponseData<>();
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setAmount(10000);
        Date date = new Date();

        try{
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            Locale idn = new Locale("id","ID");
            String monthName = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, idn);
//            int month = cal.get(Calendar.MONTH);
//            int year = cal.get(Calendar.YEAR);
            //MonthEntity monthEntity = monthRepository.findByMonth(month, year);
            Transaction transaction = transactionService.getTransactionData(user_id);
            if(transaction != null){

                transactionDTO.setStatus("lunas");
                transactionDTO.setMonth(transaction.getMonthEntity().getName());

                responseData.setStatus(true);
                responseData.getMessages().add("Data Found");
                responseData.setPayload(transactionDTO);
                return ResponseEntity.ok(responseData);
            }
            transactionDTO.setStatus("belum");
            transactionDTO.setMonth(monthName);

            responseData.setStatus(false);
            responseData.getMessages().add("Data Not Found");
            responseData.setPayload(transactionDTO);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }catch (Exception e){
            responseData.setStatus(false);
            responseData.setPayload(null);
            responseData.getMessages().add(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
    }

}
