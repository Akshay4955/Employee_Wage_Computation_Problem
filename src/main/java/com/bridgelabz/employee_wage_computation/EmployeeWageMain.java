package com.bridgelabz.employee_wage_computation;

public class EmployeeWageMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Calculator");
        IComputeWage computeWage = new ComputeWage();
        computeWage.addCompanyEmpWage("D-mart", 16, 24, 120);
        computeWage.addCompanyEmpWage("Reliance", 20, 20, 100);
        computeWage.getMonthlyWage();
        System.out.println("=============================================================================");
        System.out.println("Total wage for D-mart is " + computeWage.getTotalWage("D-mart"));
        System.out.println("Total wage for Reliance is " + computeWage.getTotalWage("Reliance"));
    }
}