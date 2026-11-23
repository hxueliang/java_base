package com.object.b02extends;

/*
    再次审视子类中属性和行为如何写的更好：
    1. 属性：私有化属性，提供public的get和set方法，通过set方法可以添加属性的校验
    2. 行为：装代码的容器，代码为了处理数据而活，我们需要分清我们能访问到的数据有哪些
        局部变量：方法中定义的变量，方法调用完毕，局部变量就不存在了
        成员变量：类中方法外定义的变量，对象存在，成员变量就存在
        参数：方法定义时，方法名后面的括号中的变量，方法调用时，传递给方法的变量
        父类的成员变量：通过super关键字访问
    3. 总结：
        this：当前对象的引用
        super：父类对象的引用
 */
public class D07ASuper {
    public static void main(String[] args) {
        D07Zi zi = new D07Zi();
        zi.ziMethod();
    }
}
