package com.object.b01abstract;

public class D03CardGold extends D03Card {
    public D03CardGold() {
    }

    public D03CardGold(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void pay(double amount) {
        // 将消费金额打8折
        amount = amount * 0.8;
        // 判断余额是否足够
        if (amount > getBalance()) {
            System.out.println("余额不足，支付失败");
            return;
        }
        setBalance(getBalance() - amount);
        System.out.println("【金卡】支付成功，余额为：" + getBalance());
    }
}
