package com.bridgelabz.employee_wage_computation;

public class EmployeeWageMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Calculator");
        IEmployeeWage employeeWage = new EmployeeWageCalculation();
            employeeWage.getMonthlyWage();
    }
}