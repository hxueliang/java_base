package com.container.b02string;


public class D02StringMethod {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = "Abc";

        System.out.println(str.length()); // 3
        System.out.println(str.charAt(1)); // b
        System.out.println();

        // 字符串比较要用equals，不能用==
        System.out.println(str.equals(str2)); // true，
        System.out.println(str == str2); // true
        System.out.println(str == str3); // false
        System.out.println(str.equals(str3)); // true
        System.out.println();

        // 大小写比较
        System.out.println(str.equals(str4)); // false
        System.out.println(str.equalsIgnoreCase(str4)); // true
        System.out.println();

        // 截取
        String str5 = "abcdef";
        System.out.println(str5.substring(2, 4)); // cd
        System.out.println(str5.substring(2)); // cdef
        System.out.println();

        // 替换
        String str6 = "abcdef";
        System.out.println(str6.replace('a', 'A')); // Abcdef
        System.out.println(str6.replace("ab", "AB")); // ABcdef
        System.out.println();

        // 是否包含某个小串
        String str7 = "abcdef";
        System.out.println(str7.contains("abc")); // true
        System.out.println(str7.contains("abce")); // false
        System.out.println();

        // 是否以某个小串开始或结束
        String str8 = "abcdef";
        System.out.println(str8.startsWith("ab")); // true
        System.out.println(str8.endsWith("ef")); // true
        System.out.println();

        // 分割
        String str9 = "aaa,bbb,ccc";
        String[] arr = str9.split(",");
        System.out.println(arr.length); // 3
        System.out.println(arr[0]); // aaa
        System.out.println(arr[1]); // bbb
        System.out.println(arr[2]); // ccc
        System.out.println();

        /*
            分割注意事项
         */
        // 1.切割后，切割点不保留
        // 2.切割点最好不在字符串的开头和结尾
        String str10 = ",,,aaa,bbb,ccc";
        String str11 = "aaa,bbb,ccc,,,";

        String[] arr10 = str10.split(",");
        String[] arr11 = str11.split(",");

        System.out.println(arr10.length); // 6
        System.out.println(arr11.length); // 3
        System.out.println();

        // 3.切割点不能使用".",这个是正则表达式的特殊字符，代表匹配所有字符
        String str12 = "aaa.bbb.ccc";
        String[] arr12 = str12.split(".");
        String[] arr13 = str12.split("\\."); // 非要用"."切割
        System.out.println(arr12.length); // 0
        System.out.println(arr13.length); // 3

    }
}
