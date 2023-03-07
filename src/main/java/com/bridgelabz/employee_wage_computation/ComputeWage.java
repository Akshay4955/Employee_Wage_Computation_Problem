package com.bridgelabz.employee_wage_computation;

public class ComputeWage implements IComputeWage {
    public static final int IS_PART_TIME = 2;
    public static final int IS_FULL_TIME = 1;
    private int noOfCompany = 0;

    public CompanyWage[] companyEmpWageArray;

    public ComputeWage () {
        companyEmpWageArray = new CompanyWage[5];
    }

    @Override
    public void addCompanyEmpWage(String company, int ratePerHour, int noOfWorkingDays, int maxWorkingHours) {
        companyEmpWageArray[noOfCompany] = new CompanyWage(company, ratePerHour, noOfWorkingDays, maxWorkingHours);
        noOfCompany++;
    }

    @Override
    public void getMonthlyWage() {
        for (int i = 0; i < noOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.getMonthlyWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    public int getMonthlyWage(CompanyWage companyWage) {
        int totalEmpHours = 0, totalWorkingDays = 0;
        while (totalEmpHours < companyWage.MAX_WORKING_HOURS && totalWorkingDays < companyWage.NO_OF_WORKING_DAYS) {
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
        return totalEmpHours * companyWage.RATE_PER_HOUR;
    }
}
