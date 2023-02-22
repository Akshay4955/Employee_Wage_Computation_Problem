package com.bridgelabz.employee_wage_computation;

public class EmployeeWageCalculation {
    int IS_FULL_TIME = 1;
    int RATE_PER_HOUR = 20;
    int empHours;

    public static void main(String[] args) {
        EmployeeWageCalculation employeeWageCalculation = new EmployeeWageCalculation();
        employeeWageCalculation.getAttendance();
        employeeWageCalculation.dailyWage();
    }

    void getAttendance() {
        if (Math.floor(Math.random() * 10) % 2 == IS_FULL_TIME)
            empHours = 8;
        else
            empHours = 0;
    }
    void dailyWage() {
        int wage = empHours * RATE_PER_HOUR;
        System.out.println("Employee earned : "+wage);

    }
}