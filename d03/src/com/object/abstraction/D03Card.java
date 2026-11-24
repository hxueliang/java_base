package com.object.abstraction;

/*
    属性：名字、余额
    行迹：支付
 */
public abstract class D03Card {
    private String name;
    private double balance;

    public abstract void pay(double amount);

    public D03Card() {
    }

    public D03Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
