package com.object.b02extends;

public class D01Fu {
    int fuNum = 10;

    private int fuNum2 = 20;

    public int getFuNum2() {
        return fuNum2;
    }

    public void setFuNum2(int fuNum2) {
        this.fuNum2 = fuNum2;
    }

    public void fuMethod() {
        System.out.println("父类方法");
    }
}
