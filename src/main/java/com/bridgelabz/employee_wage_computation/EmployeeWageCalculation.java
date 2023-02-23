package com.bridgelabz.employee_wage_computation;

public class EmployeeWageCalculation {
    public static final int RATE_PER_HOUR = 20;
    public static final int IS_PART_TIME = 2;
    public static final int IS_FULL_TIME = 1;
    public static final int NO_OF_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        EmployeeWageCalculation employeeWageCalculation = new EmployeeWageCalculation();
        employeeWageCalculation.getAttendance();
    }

    void getAttendance() {
        int totalEmpHours = 0, totalEmpWage = 0, totalWorkingDays = 0;

        while (totalEmpHours < MAX_WORKING_HOURS && totalWorkingDays < NO_OF_WORKING_DAYS) {
            int empHours = 0;
            totalWorkingDays++;
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
            int empWage = empHours * RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Employee Earned : " + empWage);
            totalEmpHours += empHours;
        }
        System.out.println("Employee earned in month: " + totalEmpWage + '\n' + "Employee working hours in month: " + totalEmpHours);
    }
}