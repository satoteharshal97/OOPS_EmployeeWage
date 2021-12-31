package com.example.employeewage;

public class EmployeeWage {
    public static final int EMP_WAGE_PER_HOUR = 20;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HOURS_FOR_MONTH = 100;

    public static void main(String[] args) {
        getMonthlyWage();
    }
    static void getMonthlyWage(){
        int totalEmpHours = 0, totalWorkingDays = 0,empHours = 0 ;

        while (totalEmpHours <= MAX_HOURS_FOR_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
            totalWorkingDays++;
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
            totalEmpHours = totalEmpHours + empHours;
        }
        int totalEmpWage = totalEmpHours * EMP_WAGE_PER_HOUR;
        System.out.println("Total Employee Wage: " + totalEmpWage);
    }
}


