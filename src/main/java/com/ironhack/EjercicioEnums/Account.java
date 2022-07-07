package com.ironhack.EjercicioEnums;

import java.math.BigDecimal;

public class Account {
    private Hold state;
    private long id;
    private String name;
    private BigDecimal balance;

    public Account(Hold state, long id, String name, BigDecimal balance) {
        this.state = state;
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Hold getState() {
        return state;
    }

    public void setState(Hold state) {
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "state=" + state +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
