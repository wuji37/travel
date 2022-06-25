package com.chinasofti.travel.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name="income")
@Table(name="income")
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  //oracle使用序列生成主键
    @Column(name="income_date", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    @Column(name="realIncome", nullable = false)
    private double realIncome;

    @Column(name="expertIncome", nullable = false)
    private double expertIncome;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getRealIncome() {
        return realIncome;
    }

    public void setRealIncome(double realIncome) {
        this.realIncome = realIncome;
    }

    public double getExpertIncome() {
        return expertIncome;
    }

    public void setExpertIncome(double expertIncome) {
        this.expertIncome = expertIncome;
    }

    public Income(Date date, double realIncome, double expertIncome) {
        this.date = date;
        this.realIncome = realIncome;
        this.expertIncome = expertIncome;
    }

    public Income() {
    }

    @Override
    public String toString() {
        return "Income{" +
                "date=" + date +
                ", realIncome=" + realIncome +
                ", expertIncome=" + expertIncome +
                '}';
    }

    public void setIncome(Income income){
        this.date=income.getDate();
        this.expertIncome=income.getExpertIncome();
        this.realIncome=income.getRealIncome();
    }
}
