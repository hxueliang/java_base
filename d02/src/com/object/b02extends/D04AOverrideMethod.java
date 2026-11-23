package com.object.b02extends;

public record D04AOverrideMethod() {
    public static void main(String[] args) {
        D04Zi zi = new D04Zi();
        System.out.println(zi.num); // 3

        zi.method(); // D04Zi method
    }
}
