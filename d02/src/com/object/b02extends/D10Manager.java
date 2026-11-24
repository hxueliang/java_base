package com.object.b02extends;

public class D10Manager extends D10Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public D10Manager() {
    }

    public D10Manager(String name, double salary, int workId, double bonus) {
        super(name, salary, workId);
        this.bonus = bonus;
    }

    public void work() {
        System.out.println(getName() + "正在写安排工作，" + "薪资：" + getSalary() + "，工号：" + getWorkId() + "，奖金：" + bonus);
    }
}
