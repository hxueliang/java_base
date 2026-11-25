package com.object.b03polymorphic;

/*
    多态的弊端：多态格式下无法调用子类的特有内容
    为什么无法调用子类的特有内容：
        方法定义者在定义方法的时候，可以接收所有子类，而不是某个具体的子类，所以只能调用子类共有的内容，而不能调用子类特有内容
    如何解决多态的弊端：多态转型
        1. 向上转型：将子类转换为父类，(多态本质就是一种向上转型)
        2. 向下转型：将父类转换为子类，(父类"还原"成子类，一定是还原，否则会编译错误)
            格式：子类名 变量名 = (子类名) 父类变量名;
            如何避免类转换异常：instanceof
                总结：
                    我们用多态要用多态的优点，不要用多态的弊端，
                    本次多态里用到instanceof来避免类转换异常，到不如不使用多态，
                    改为方法重载，每个方法里定义一个子类，这样就可以调用子类特有内容

                    即：使用大家都有的功能用多态，使用大家没有的功能用方法重载
 */
public class D04AMalpractice {
    public static void main(String[] args) {
        /*
        D04Animal animal = new D04Dog("旺财", 2);
        animal.eat();
        // animal.swim(); // animal类型变量，无法调用子类的特有内容
         */

        method(new D04Dog("旺财", 2));
        System.out.println("------");
        method(new D04Cat("花花", 1)); // Cat cannot be converted to Dog
    }

    public static void method(D04Animal animal) {
        animal.eat();
        if (animal instanceof D04Dog) {
            D04Dog dog = (D04Dog) animal;
            dog.swim();
        }
    }
}
