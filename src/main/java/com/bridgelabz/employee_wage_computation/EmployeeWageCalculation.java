package com.bridgelabz.employee_wage_computation;

public class EmployeeWageCalculation {
    int IS_FULL_TIME = 1;

    public static void main(String[] args) {
        EmployeeWageCalculation employeeWageCalculation = new EmployeeWageCalculation();
        employeeWageCalculation.getAttendance();
    }

    void getAttendance() {
//        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (Math.floor(Math.random() * 10) % 2 == IS_FULL_TIME)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}