package com.练习.polyparameter;

public class Ordinary_staff extends Employee{
    public Ordinary_staff(String name, double salary) {
        super(name, salary);
    }
    public void work() {
        System.out.println("工人："+getName()+"正在工作...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
