package com.example.employeewage;

public class EmployeeWage {
    public static final int EMP_WAGE_PER_HOUR = 20;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static void main(String[] args) {
        getFullOrPartTimeWage();
    }
    static void getFullOrPartTimeWage(){
        int empHours = 0;
        int empWage = 0;
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
            System.out.println("Employee Wage: " + empWage);
        }
}


