package com.bridgelabz.employee_wage_computation;

public class EmployeeWageMain {
    public static final int IS_PART_TIME = 2;
    public static final int IS_FULL_TIME = 1;
    private int noOfCompany = 0;

    private final CompanyWage[] companyEmpWageArray;

    public EmployeeWageMain() {
        companyEmpWageArray = new CompanyWage[5];
    }

    private void addCompanyEmpWage(String company, int ratePerHour, int noOfWorkingDays, int maxWorkingHours) {
        companyEmpWageArray[noOfCompany] = new CompanyWage(company, ratePerHour, noOfWorkingDays, maxWorkingHours);
        noOfCompany++;
    }

    private void getMonthlyWage() {
        for (int i = 0; i < noOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.getMonthlyWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Calculator");
        EmployeeWageMain employeeWageMain = new EmployeeWageMain();
        employeeWageMain.addCompanyEmpWage("D-mart", 16, 24,120);
        employeeWageMain.addCompanyEmpWage("Reliance", 20, 20, 100);
        employeeWageMain.getMonthlyWage();
    }


    public int getMonthlyWage(CompanyWage companyWage) {
        int totalEmpHours = 0, totalWorkingDays = 0;
        while (totalEmpHours < companyWage.maxWorkingHours && totalWorkingDays < companyWage.noOfWorkingDays) {
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
        return totalEmpHours * companyWage.ratePerHour;
    }


    }