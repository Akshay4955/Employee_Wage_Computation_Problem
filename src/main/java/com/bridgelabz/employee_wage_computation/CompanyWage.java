package com.bridgelabz.employee_wage_computation;

public class CompanyWage {
    public final String COMPANY;
    public final int RATE_PER_HOUR;
    public final int NO_OF_WORKING_DAYS;
    public final int MAX_WORKING_HOURS;
    public int totalEmpWage;

    public CompanyWage(String company, int ratePerHour, int noOfWorkingDays, int maxWorkingHours) {
        this.COMPANY = company;
        this.RATE_PER_HOUR = ratePerHour;
        this.NO_OF_WORKING_DAYS = noOfWorkingDays;
        this.MAX_WORKING_HOURS = maxWorkingHours;
    }

    public void setTotalEmpWage(int totalEmpWage) {

        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {

        return "Total employee wage for company " + COMPANY + " is " + totalEmpWage;
    }
}
