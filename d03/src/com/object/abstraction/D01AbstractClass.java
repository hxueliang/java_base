package com.object.abstraction;

/*
    抽象类：public abstract class 类名{}
        特点：不能直接创建对象
    抽象方法：public abstract 返回值类型 方法名(参数列表)；
        特点：没胡方法体
    注意事项：
        抽象类不能创建对象
        抽象方法所在的类必须是抽象类
        定义子类继承抽象类的时候，要么子类重写抽象方法，要么自己也是抽象类
    抽象类如何用？
        因为抽象类可能含有抽象方法，抽象方法没有方法体，所以不能直接使用
        如果非要使用，我们必须定义一个类去继承抽象类，然后重写他的抽象方法
 */
public class D01AbstractClass {
    public static void main(String[] args) {
        D01C c = new D01C();
        c.method();
    }
}
