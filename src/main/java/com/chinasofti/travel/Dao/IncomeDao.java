package com.chinasofti.travel.Dao;

import com.chinasofti.travel.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


public interface IncomeDao extends JpaRepository<Income, Date> {

}
