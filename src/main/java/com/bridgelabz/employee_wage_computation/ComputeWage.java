package com.bridgelabz.employee_wage_computation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeWage implements IComputeWage {
    public static final int IS_PART_TIME = 2;
    public static final int IS_FULL_TIME = 1;

    private List<CompanyWage> companyEmpWageArrayList;
    private Map<String, CompanyWage> companyToEmpWageMap;

    public ComputeWage() {
        companyEmpWageArrayList = new ArrayList<>();
        companyToEmpWageMap = new HashMap<>();
    }

    @Override
    public void addCompanyEmpWage(String company, int ratePerHour, int noOfWorkingDays, int maxWorkingHours) {
        CompanyWage companyWage = new CompanyWage(company, ratePerHour, noOfWorkingDays, maxWorkingHours);
        companyEmpWageArrayList.add(companyWage);
        companyToEmpWageMap.put(company, companyWage);
    }

    @Override
    public void getMonthlyWage() {
        for (int i = 0; i < companyEmpWageArrayList.size(); i++) {
            CompanyWage companyWage = companyEmpWageArrayList.get(i);
            companyWage.setTotalEmpWage(this.getMonthlyWage(companyWage));
            System.out.println(companyWage);
        }
    }

    @Override
    public int getTotalWage(String company) {
        return companyToEmpWageMap.get(company).totalEmpWage;
    }


    public int getMonthlyWage(CompanyWage companyWage) {
        int totalEmpHours = 0, totalWorkingDays = 0, day =0;
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
            int dailyWage = empHours * companyWage.RATE_PER_HOUR;
            companyWage.dailyWage[day] = dailyWage;
            day++;
            totalEmpHours += empHours;
        }
        System.out.println("Daily wage is: " );
        for (int x = 0; x < totalWorkingDays; x++) {
            System.out.print(companyWage.dailyWage[x] + " ");
        }
        System.out.println();
        return totalEmpHours * companyWage.RATE_PER_HOUR;
    }
}
