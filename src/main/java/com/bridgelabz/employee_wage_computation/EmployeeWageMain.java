package com.bridgelabz.employee_wage_computation;

public class EmployeeWageMain {
    public static final int IS_PART_TIME = 2;
    public static final int IS_FULL_TIME = 1;

    private final String company;
    private final int ratePerHour;
    private final int noOfWorkingDays;
    private final int maxWorkingHours;
    private int totalEmpWage;

    public EmployeeWageMain(String company, int ratePerHour, int noOfWorkingDays, int maxWorkingHours) {
        this.company = company;
        this.ratePerHour = ratePerHour;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Calculator");
        EmployeeWageMain dMart = new EmployeeWageMain("D-mart", 18, 24, 120);
        EmployeeWageMain reliance = new EmployeeWageMain("Reliance", 20, 20, 100);
        dMart.getMonthlyWage();
        System.out.println(dMart);
        reliance.getMonthlyWage();
        System.out.println(reliance);
    }


    public void getMonthlyWage() {
        int totalEmpHours = 0, totalWorkingDays = 0;
        while (totalEmpHours < maxWorkingHours && totalWorkingDays < noOfWorkingDays) {
            totalWorkingDays++;
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
            totalEmpHours += empHours;
        }
        totalEmpWage = totalEmpHours * ratePerHour;
    }

        @Override
        public String toString() {
            return "Total employee wage for company " + company + " is " + totalEmpWage;
        }
    }