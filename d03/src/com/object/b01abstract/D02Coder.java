package com.object.b01abstract;

public class D02Coder extends D02Employee {
    public D02Coder() {
    }

    public D02Coder(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("程序猿" + getName() + "在写代码");
    }
}
