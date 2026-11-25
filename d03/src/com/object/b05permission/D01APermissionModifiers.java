package com.object.b05permission;

/*
    权限修饰符：public > protected > 缺省(default) > private
        public:     本类      本包      不同子类        不同包无关系
        protected:  本类      本包      不同子类
        default:    本类      本包
        private:    本类
 */
public class D01APermissionModifiers {
    public static void main(String[] args) {
        /*
            本包内，除了private，其他权限修饰符的方法都能访问
         */
        D01B b = new D01B();
        b.publicMethod();
        b.protectedMethod();
        b.defaultMethod();
        // b.privateMethod();
    }
}
