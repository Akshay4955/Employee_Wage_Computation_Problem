package com.bridgelabz.employee_wage_computation;

public class EmployeeWageCalculation {
    int IS_FULL_TIME = 1;
    int IS_PART_TIME = 2;
    int RATE_PER_HOUR = 20;
    int empHours;

    public static void main(String[] args) {
        EmployeeWageCalculation employeeWageCalculation = new EmployeeWageCalculation();
        employeeWageCalculation.getAttendance();
        employeeWageCalculation.dailyWage();
    }

    void getAttendance() {
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME)
            empHours = 8;
        else if (empCheck == IS_PART_TIME)
            empHours = 4;
        else
            empHours = 0;
    }

    void dailyWage() {
        int wage = empHours * RATE_PER_HOUR;
        System.out.println("Employee earned : " + wage);

    }
}