package com.object.b05permission2;


import com.object.b05permission.D01B; // 导包

/*
    只有相同包，或java.lang包下的类，不导包也能访问
    其他情况，需要导包，才能访问
 */
public class D02APermissionModifiers2 {
    public static void main(String[] args) {
        /*
            不同包无关类中，四种权限修饰符的方法只能访问public
         */
        D01B b = new D01B();
        b.publicMethod();
        // b.protectedMethod();
        // b.defaultMethod();
        // b.privateMethod();
    }
}
