package com.bridgelabz.employee_wage_computation;

public class EmployeeWageCalculation {
    int RATE_PER_HOUR = 20;
    int empHours;

    public static void main(String[] args) {
        EmployeeWageCalculation employeeWageCalculation = new EmployeeWageCalculation();
        employeeWageCalculation.getAttendance();
    }

    void getAttendance() {
        int totalEmpHours = 0;
        for (int i = 1; i <= 20; i++) {
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
            totalEmpHours += empHours;
        }
        System.out.println("Employee earned in month: " + (totalEmpHours * RATE_PER_HOUR));
    }

}