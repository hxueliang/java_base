package com.object.b02extends;

/*
    经理：
        name、salary、workId、bonus
        work()
    程序员：
        name、salary、workId
        work()
 */
public class D10AEmployeeDemo {
    public static void main(String[] args) {
        D10Coder coder1 = new D10Coder();
        coder1.setName("hxl1");
        coder1.setSalary(55000);
        coder1.setWorkId(1001);

        D10Coder coder2 = new D10Coder("hxl2", 30000, 1002);
        D10Manager manager1 = new D10Manager("lzz", 20000, 2001, 30000);

        coder1.work();
        coder2.work();
        manager1.work();
    }
}
