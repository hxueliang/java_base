package com.object.b01abstract;

public class D02Manager extends D02Employee {
    private double bonus;

    public D02Manager() {
    }

    public D02Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + "在分配工作" + "，这个月的奖金" + bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
