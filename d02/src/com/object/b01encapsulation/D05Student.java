package com.object.b01encapsulation;

/*
 * 构造函数：用来给对象的属性初始化
 *  格式：
 *      public 类名(参数列表) {
 *      }
 *  注意事项：
 *      1. 构造函数的名称必须与类名完全相同
 *      2. 构造函数没有返回类型，甚至没有void
 *      3. 构造函数可以重载
 *      4. 如果没有定义构造函数，编译器会自动提供一个无参构造函数
 *      5. 如果定义了构造函数，编译器将不再提供无参构造函数
 *  JavaBean：符合JavaBean规范的类，通常用于封装数据，也称为JavaBean规范
 *      1. 类必须是public的
 *      2. 类名必须符合驼峰命名法，即每个单词的首字母大写，不使用下划线和连字符
 *      3. 类中所有的属性必须是private的
 *      4. 类中必须提供一个无参的构造函数（建议提供满参的构造函数）
 *      5. 类中必须提供所有属性的set和get方法
 *  快捷方式：
 *      右键 -> Generate -> Constructor -> 选择需要的构造函数
 */

public class D05Student {
    // 属性
    /**
     * 姓名
     */
    String name;
    /**
     * 年龄
     */
    int age;
    /**
     * 性别
     */
    String sex;
    /**
     * 专业
     */
    String major;
    /**
     * 电话
     */
    String phone;
    /**
     * 地址
     */
    String address;
    /**
     * 邮箱
     */
    String email;
    /**
     * 学号
     */
    String sid;
    /**
     * 班级
     */
    String className;
    /**
     * 老师姓名
     */
    String teacherName;
    /**
     * 老师工号
     */
    String teacherId;
    /**
     * 老师电话
     */
    String teacherPhone;

    // 行为

    // 构造函数

    public D05Student() {
    }

    public D05Student(String name, int age, String sex, String major, String phone, String address, String email, String sid, String className, String teacherName, String teacherId, String teacherPhone) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.major = major;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.sid = sid;
        this.className = className;
        this.teacherName = teacherName;
        this.teacherId = teacherId;
        this.teacherPhone = teacherPhone;
    }
}
