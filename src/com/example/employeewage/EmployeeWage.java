package com.example.employeewage;

public class EmployeeWage {
    public static final int EMP_WAGE_PER_HOUR = 20;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int NUM_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        getMonthlyWage();
    }
    static void getMonthlyWage(){
        int empHours, empWage, totalEmpWage = 0;
        for(int day = 0; day < NUM_OF_WORKING_DAYS;  day++){
            int empChecker = (int)Math.floor(Math.random() * 10) % 3;

            switch(empChecker){
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            empWage = empHours * EMP_WAGE_PER_HOUR;
            totalEmpWage = totalEmpWage + empWage;
            System.out.println("Employee Wage: " + empWage);
        }
        System.out.println("Total Employee Wage: " + totalEmpWage);
    }
}


