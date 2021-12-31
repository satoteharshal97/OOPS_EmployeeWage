package com.example.employeewage;

public class EmployeeWage {
    public static final int EMP_WAGE_PER_HOUR = 20;
    public static final int IS_FULL_TIME = 1;

    public static void main(String[] args) {
        dailyWage();
    }
    static void dailyWage(){
        int empHours = 0;
        int empWage = 0;
        double empChecker = (int)Math.floor(Math.random() * 10) % 2;

        if(empChecker == IS_FULL_TIME) {
            empHours = 8;
        }
        else {
            empHours = 0;
        }
        empWage = empHours * EMP_WAGE_PER_HOUR;
        System.out.println("Employee Wage: " + empWage);
    }
}
