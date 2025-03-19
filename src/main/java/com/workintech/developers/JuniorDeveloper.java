package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Junior Developer is learning and coding");
        setSalary(getSalary() * 1.05); // 5% salary increase when working
    }
} 