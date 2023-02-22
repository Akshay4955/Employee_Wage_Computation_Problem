package com.bridgelabz.employee_wage_computation;

public class EmployeeWageCalculation {
    int RATE_PER_HOUR = 20;
    int empHours;

    public static void main(String[] args) {
        EmployeeWageCalculation employeeWageCalculation = new EmployeeWageCalculation();
        employeeWageCalculation.getAttendance();
        employeeWageCalculation.dailyWage();
    }

    void getAttendance() {
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case 1:
                empHours = 8;
                break;
            case 2:
                empHours = 4;
                break;
            default:
                empHours = 0;
                break;
        }
    }

    void dailyWage() {
        int wage = empHours * RATE_PER_HOUR;
        System.out.println("Employee earned : " + wage);

    }
}