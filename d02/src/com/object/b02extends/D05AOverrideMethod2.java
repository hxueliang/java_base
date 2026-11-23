package com.object.b02extends;

/**
 * 方法重写作用:
 * 扩展父类方法功能，而不是替换父类方法功能
 * 从而实现新业务逻辑，不影响旧业务逻辑
 */
public record D05AOverrideMethod2() {
    public static void main(String[] args) {
        oldBusiness();
        newBusiness();
    }

    /**
     * 旧业务逻辑
     */
    private static void oldBusiness() {

        D05Phone phone = new D05Phone();
        phone.call();
    }

    /**
     * 新业务逻辑
     */
    private static void newBusiness() {
        D05PhonePlus phonePlus = new D05PhonePlus();
        phonePlus.call();
    }
}
