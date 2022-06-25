package com.chinasofti.travel.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name="group")
@Table(name="agroup")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)   //表示保存时必须有值，unique=true是指这个字段的值在这张表里不能重复
    private Long id;

    @Column(name="maxNum")
    private int maxNum;

    @Column(name="minNum")
    private int minNum;

    @Column(name="startTime", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    @Column(name="endTime", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

    @Column(name="payment", nullable = false)
    private double payment;

    @Column(name="placeId", nullable = false)
    private long placeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getMinNum() {
        return minNum;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(long placeId) {
        this.placeId = placeId;
    }

    public Group(Long id, int maxNum, int minNum, Date startTime, Date endTime, double payment, long placeId) {
        this.id = id;
        this.maxNum = maxNum;
        this.minNum = minNum;
        this.startTime = startTime;
        this.endTime = endTime;
        this.payment = payment;
        this.placeId = placeId;
    }

    public Group() {
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", maxNum=" + maxNum +
                ", minNum=" + minNum +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", payment=" + payment +
                ", placeId=" + placeId +
                '}';
    }
}
