package com.练习.polyparameter;

public class manager extends Employee{
    private double bonus;
    public manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("经理："+getName()+"正在监工...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }
}
