package com.chinasofti.travel.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name="record")
@Table(name="joinRecord")
public class JoinRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false)
    private long id;

    @Column(name="jr_date",nullable = false)

    private Date date;

    @Column(name="accountNumber")
    private long accountNumber;

    @Column(name="groupId")
    private long groupId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public JoinRecord(long id, Date date, long accountNumber, long groupId) {
        this.id = id;
        this.date = date;
        this.accountNumber = accountNumber;
        this.groupId = groupId;
    }

    public JoinRecord() {
    }

    @Override
    public String toString() {
        return "JoinRecord{" +
                "id=" + id +
                ", date=" + date +
                ", accountNumber=" + accountNumber +
                ", groupId=" + groupId +
                '}';
    }
}

