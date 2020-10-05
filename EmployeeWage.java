package employee;

import java.util.ArrayList;

//interface declation
interface IntEmployeeWage
{
public void addCompanyEmpWage(String Company, int EmpRatePerHr, int NumOfWorkingDays, int MaxHrsPerMonth);
public void ComputeEmpWage();
}

class CompanyEmpWage
{
public final int EmpRatePerHr;
public final int NumOfWorkingDays;
public final int MaxHrsPerMonth;
public String Company;
public int totalEmpWage;

//CONSTRUCTOR
public CompanyEmpWage(String Company, int EmpRatePerHr, int NumOfWorkingDays, int MaxHrsPerMonth)
{
this.Company = Company;
this.EmpRatePerHr = EmpRatePerHr;
this.NumOfWorkingDays = NumOfWorkingDays;
this.MaxHrsPerMonth = MaxHrsPerMonth;
totalEmpWage=0;
}

public void setTotalEmpWage(int totalEmpWage) {
	this.totalEmpWage=totalEmpWage;
}
public void Show()
{
	System.out.println("Company Name : "+this.Company+", Total Wage :"+this.totalEmpWage);
}

}


public class EmployeeWage implements IntEmployeeWage
{
//CONSTANTS
private static final int IS_FULL_TIME=1;
private static final int IS_PART_TIME=0;

private int numOfCompany = 0;
private ArrayList<CompanyEmpWage> companyEmpWageList;


public EmployeeWage()
{
companyEmpWageList=new ArrayList<>();
}
  
public void addCompanyEmpWage(String Company, int EmpRatePerHr, int NumOfWorkingDays, int MaxHrsPerMonth)
{
companyEmpWageList.add(new CompanyEmpWage(Company, EmpRatePerHr, NumOfWorkingDays, MaxHrsPerMonth));
}

public void ComputeEmpWage()
{
	for(CompanyEmpWage list:companyEmpWageList)
{
list.setTotalEmpWage(ComputeEmpWage(list));
list.Show();
	}
}

public int ComputeEmpWage(CompanyEmpWage companyEmpWage)
{

//variables
int totalEmpHours=0;
int empHrs=0;
int totalWorkingDays=0;

//Display the Welcome Message
System.out.println("Welcome to the EmployeeWage Program");

//Computation
while(totalEmpHours <= companyEmpWage.MaxHrsPerMonth && totalWorkingDays <  companyEmpWage.NumOfWorkingDays)
{
	totalWorkingDays++;

	//generate 0-2
	int employeeCheck=(int) Math.floor(Math.random()*10)%3;
/*
* Switch Case
*/
switch(employeeCheck)
{
case IS_FULL_TIME :
	System.out.println("Employee is full time");
	totalEmpHours=8;
	break;
case IS_PART_TIME :
	System.out.println("Employee is part time");
	totalEmpHours=4;
	break;
default :
	System.out.println("employee absent");
	break;

}

//Display Working Day per Month
totalEmpHours+=empHrs;
System.out.println("Day:" +totalWorkingDays+"Emp Hour:"+empHrs);

}

return totalEmpHours * companyEmpWage.EmpRatePerHr;
}

public static void main(String[] args) {

//EmployeeWage for Multiple Companies
IntEmployeeWage empwageBuilder = new EmployeeWage();
empwageBuilder.addCompanyEmpWage("Amazon",20,2,10);
empwageBuilder.addCompanyEmpWage("FlipKart",10,4,20);
empwageBuilder.addCompanyEmpWage("FirstCry",20,4,15);
empwageBuilder.ComputeEmpWage();
}
}

