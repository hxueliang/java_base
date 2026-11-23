package com.object.b02extends;

/*
    Object.toString方法的使用：
        默认将带@符号的hash地址转换为字符串，但我们可以重写toString方法，返回我们想要的字符串
        右键 -> generate -> toString -> 选中所有的属性
 */
public class D08AToString {
    public static void main(String[] args) {
        D08Student student = new D08Student("张三", 18);
        System.out.println(student);
    }
}
