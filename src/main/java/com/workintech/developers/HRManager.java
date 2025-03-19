package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing the team");
        setSalary(getSalary() * 1.1); // 10% salary increase when working
    }

    public void addEmployee(JuniorDeveloper developer) {
        for(int i = 0; i < juniorDevelopers.length; i++) {
            if(juniorDevelopers[i] == null) {
                juniorDevelopers[i] = developer;
                return;
            }
        }
        System.out.println("Warning: Junior developer array is full!");
    }

    public void addEmployee(MidDeveloper developer) {
        for(int i = 0; i < midDevelopers.length; i++) {
            if(midDevelopers[i] == null) {
                midDevelopers[i] = developer;
                return;
            }
        }
        System.out.println("Warning: Mid developer array is full!");
    }

    public void addEmployee(SeniorDeveloper developer) {
        for(int i = 0; i < seniorDevelopers.length; i++) {
            if(seniorDevelopers[i] == null) {
                seniorDevelopers[i] = developer;
                return;
            }
        }
        System.out.println("Warning: Senior developer array is full!");
    }
} 