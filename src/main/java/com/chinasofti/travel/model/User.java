package com.chinasofti.travel.model;

import javax.persistence.*;

@Entity
@Table(name="AUSER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ACCOUNTNUMBER",nullable = false)
    private long accountNumber;

    @Column(name="PASSWORDNUMBER",nullable = false)
    private long password;

    @Column(name="NAME",nullable = false)
    private String name;

    @Column(name="IDENTITY",nullable = false)
    private int identity;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public User(long accountNumber, long password, String name, int identity) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.name = name;
        this.identity = identity;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "accountNumber=" + accountNumber +
                ", password=" + password +
                ", name='" + name + '\'' +
                ", identity=" + identity +
                '}';
    }

    public void setUser(long accountNumber, long password, String name, int identity) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.name = name;
        this.identity = identity;
    }
}
