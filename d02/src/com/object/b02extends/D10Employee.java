package com.object.b02extends;

public class D10Employee {
    private String name;
    private double salary;
    private int workId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
    }

    public D10Employee() {
    }

    public D10Employee(String name, double salary, int workId) {
        this.name = name;
        this.salary = salary;
        this.workId = workId;
    }

    public void work() {
    }
}
