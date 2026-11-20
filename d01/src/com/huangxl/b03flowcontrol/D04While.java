package com.huangxl.b03flowcontrol;

public class D04While {
    /**
     * while
     */
    public static void main(String[] args) {
        // 折纸，折多少次，厚度会超过珠峰
        int count = 0;
        double paper = 0.1 / 1000; // 0.1毫米转为米
        while (paper <= 8848) {
            paper *= 2;
            count++;
            System.out.println("折第" + count + "次，当前纸的厚度为" + paper + "米");
        }
        System.out.println("================");
        System.out.println("折" + count + "次，最后一次纸的厚度为" + paper + "米");
    }
}
