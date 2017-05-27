package com.example.demo.loanaaplication;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

/**
 * Created by karan on 27/5/17.
 */
public interface LoanRepository extends CrudRepository<LoanApplication,Long>{
    @Query("select loan from LoanApplication loan where loan.userId =:id")
    ArrayList<LoanApplication> findAllByUserId(@Param("id") int id);
}
