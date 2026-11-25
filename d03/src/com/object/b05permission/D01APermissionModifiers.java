package com.object.b05permission;

/*
    权限修饰符：public > protected > 缺省(default) > private
        public:     本类      本包      不同包子类        不同包无关系
        protected:  本类      本包      不同包子类
        default:    本类      本包
        private:    本类
    常用：public、private 两个最常用
    扩展：
        public interface A {
            // 成员变量：默认被 public static final 修饰 (即：public哪里都能访问，static通过接口名.成员变量名访问，final不可修改)

            // 成员方法：默认被 public abstract 修饰 (即：public哪里都能访问，abstract抽象方法，没有方法体)
        }
        细节：
            private 和 abstract冲突（因为：private不能重写，abstract必需要重写）
            final 和 abstract冲突（因为：final不能重写，abstract必需要重写）
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
