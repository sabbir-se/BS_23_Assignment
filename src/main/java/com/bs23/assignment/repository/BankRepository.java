package com.bs23.assignment.repository;

import com.bs23.assignment.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sabbir on 12/12/20.
 */
@Transactional
public interface BankRepository extends JpaRepository<Bank, Long> {

}
