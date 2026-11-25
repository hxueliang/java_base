package com.object.b05permission2;

import com.object.b05permission.D01B;

public class D02C extends D01B {

    public void method() {
        /*
            不同包，子类中，四种权限修饰符的方法只能访问public和protected
         */
        this.publicMethod();
        this.protectedMethod();
        // this.defaultMethod();
        // this.privateMethod();
    }
}
