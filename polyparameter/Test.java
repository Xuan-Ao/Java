package com.练习.polyparameter;

public class Test {
    public static void main(String[] args) {
        Ordinary_staff o = new Ordinary_staff("tom",2500);
        manager manager = new manager("tom",6000,10000);
        Test test = new Test();
        test.showEmpAnnual(o);
        test.showEmpAnnual(manager);

        test.testWork(o);
        test.testWork(manager);
        "hh".equals("dda");
    }
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e) {
        if(e instanceof Ordinary_staff) {
            ((Ordinary_staff) e).work();
        }else if (e instanceof manager) {
            ((manager) e).manage();
        }
    }
}
