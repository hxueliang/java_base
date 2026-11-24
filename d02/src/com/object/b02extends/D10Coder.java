package com.object.b02extends;

public class D10Coder extends D10Employee {
    public D10Coder() {
    }

    public D10Coder(String name, double salary, int workId) {
        super(name, salary, workId);
    }

    public void work() {
        System.out.println(getName() + "正在写代码，" + "薪资：" + getSalary() + "，工号：" + getWorkId());
    }
}
