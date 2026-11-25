package com.object.b03polymorphic;

/*
    多态的弊端：多态格式下无法调用子类的特有内容
    为什么无法调用子类的特有内容：
        方法定义者在定义方法的时候，可以接收所有子类，而不是某个具体的子类，所以只能调用子类共有的内容，而不能调用子类特有内容
    如何解决多态的弊端：多态转型
        1. 向上转型：将子类转换为父类，(多态本质就是一种向上转型)
        2. 向下转型：将父类转换为子类，(父类"还原"成子类，一定是还原，否则会编译错误)
            格式：子类名 变量名 = (子类名) 父类变量名;
 */
public class D04AMalpractice {
    public static void main(String[] args) {
        /*
        D04Animal animal = new D04Dog("旺财", 2);
        animal.eat();
        // animal.swim(); // animal类型变量，无法调用子类的特有内容
         */

        method(new D04Dog("旺财", 2));
    }

    public static void method(D04Animal animal) {
        animal.eat();
        D04Dog dog = (D04Dog) animal;
        dog.swim();
    }
}
