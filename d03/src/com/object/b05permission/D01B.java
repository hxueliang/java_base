package com.object.b05permission;

public class D01B {

    public void method() {
        /*
            本类中，四种权限修饰符的方法都能访问
         */
        this.publicMethod();
        this.protectedMethod();
        this.defaultMethod();
        this.privateMethod();
    }
    public void publicMethod() {
        System.out.println("Public Method");
    }
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
    void defaultMethod() {
        System.out.println("Default Method");
    }
    private void privateMethod() {
        System.out.println("Private Method");
    }
}
