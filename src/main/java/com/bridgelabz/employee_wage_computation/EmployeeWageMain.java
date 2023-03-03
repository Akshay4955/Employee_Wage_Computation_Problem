package com.bridgelabz.employee_wage_computation;

public class EmployeeWageMain {
    public static final int IS_PART_TIME = 2;
    public static final int IS_FULL_TIME = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Calculator");
        EmployeeWageMain employeeWage = new EmployeeWageMain();
        employeeWage.getMonthlyWage("D-mart", 20,20, 110);
        System.out.println();
        employeeWage.getMonthlyWage("Reliance", 17,26, 150);
        System.out.println();
        employeeWage.getMonthlyWage("Big-Basket", 15,22, 135);
    }


    public void getMonthlyWage(String company, int ratePerHour, int noOfWorkingDays, int maxWorkingHours) {
        int totalEmpHours = 0, totalEmpWage = 0, totalWorkingDays = 0;
        while (totalEmpHours < maxWorkingHours && totalWorkingDays < noOfWorkingDays) {
            totalWorkingDays++;
            int empHours = getDailyWorkingHours();
            int empWage = empHours * ratePerHour;
            totalEmpWage += empWage;
            totalEmpHours += empHours;
        }

        System.out.println("Employee working at " + company + " earned in month: " + totalEmpWage +
                '\n' + "Employee working hours in month: " + totalEmpHours);
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