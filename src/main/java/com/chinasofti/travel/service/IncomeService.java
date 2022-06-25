package com.chinasofti.travel.service;

import com.chinasofti.travel.model.Income;

import java.util.Date;
import java.util.List;

public interface IncomeService {
    public void addIncome(Income income);

    public void deleteIncomeById(Date date);

    public Income queryIncomeById(Date date);

    public List<Income> queryAllIncome();

    public void updateIncome(Income income);
}
