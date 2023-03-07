package com.bridgelabz.employee_wage_computation;

public interface IComputeWage {
    void addCompanyEmpWage(String company, int ratePerHour, int noOfWorkingDays, int maxWorkingHours);
    void getMonthlyWage();

}
