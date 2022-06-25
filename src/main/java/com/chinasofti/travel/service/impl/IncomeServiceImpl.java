package com.chinasofti.travel.service.impl;

import com.chinasofti.travel.Dao.IncomeDao;
import com.chinasofti.travel.model.Income;
import com.chinasofti.travel.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class IncomeServiceImpl implements IncomeService {
    @Autowired
    private IncomeDao incomeDao;

    @Override
    public void addIncome(Income income) {
        incomeDao.save(income);
    }

    @Override
    public void deleteIncomeById(Date date) {
        incomeDao.deleteById(date);
    }

    @Override
    public Income queryIncomeById(Date date) {
        Optional<Income> income=incomeDao.findById(date);
        return income.get();   //如果optional的值为空，则可能报错
    }

    @Override
    public List<Income> queryAllIncome() {
        List<Income> list=incomeDao.findAll();
        return list;
    }

    @Override
    public void updateIncome(Income income) {
        Optional<Income> income1=incomeDao.findById(income.getDate());
        Income income2=income1.get();

        incomeDao.save(income2);
    }
}
