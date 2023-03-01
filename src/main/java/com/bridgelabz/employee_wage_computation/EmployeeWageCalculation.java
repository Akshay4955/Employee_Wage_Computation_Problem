package com.bridgelabz.employee_wage_computation;

import java.util.Scanner;

public class EmployeeWageCalculation implements IEmployeeWage {
    public static final int IS_PART_TIME = 2;
    public static final int IS_FULL_TIME = 1;


    @Override
    public void getMonthlyWage() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rate per hour: ");
        int ratePerHour = input.nextInt();
        System.out.println("Enter No of Working Days: ");
        int noOfWorkingDays = input.nextInt();
        System.out.println("Enter Maximum Working Hours: ");
        int maxWorkingHours = input.nextInt();
        int totalEmpHours = 0, totalEmpWage = 0, totalWorkingDays = 0;
        while (totalEmpHours < maxWorkingHours && totalWorkingDays < noOfWorkingDays) {
            totalWorkingDays++;
            int empHours = getDailyWorkingHours();
            int empWage = empHours * ratePerHour;
            totalEmpWage += empWage;
            System.out.println("Employee Earned : " + empWage);
            totalEmpHours += empHours;
        }

        System.out.println("Employee earned in month: " + totalEmpWage + '\n' + "Employee working hours in month: " + totalEmpHours);
        System.out.println("Employee Working days in month: " + totalWorkingDays);
    }

    public int getDailyWorkingHours() {
        int empHours;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case IS_FULL_TIME:
                empHours = 8;
                break;
            case IS_PART_TIME:
                empHours = 4;
                break;
            default:
                empHours = 0;
                break;
        }

        return empHours;
    }
}