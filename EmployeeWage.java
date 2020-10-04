class CompanyEmpWage
{
public final int EmpRatePerHr;
public final int NumOfWorkingDays;
public final int MaxHrsPerMonth;
public String Company;

//CONSTRUCTOR
public CompanyEmpWage(String Company, int EmpRatePerHr, int NumOfWorkingDays, int MaxHrsPerMonth)
{
this.Company = Company;
this.EmpRatePerHr = EmpRatePerHr;
this.NumOfWorkingDays = NumOfWorkingDays;
this.MaxHrsPerMonth = MaxHrsPerMonth;
}
}

public class EmployeeWage
{
//CONSTANTS
private static final int IS_FULL_TIME=1;
private static final int IS_PART_TIME=0;

private int numOfCompany = 0;
private CompanyEmpWage[] CompanyEmpWageArray;

public EmployeeWage()
{
CompanyEmpWageArray = new CompanyEmpWage[5];
}
 
private void addCompanyEmpWage(String Company, int EmpRatePerHr, int NumOfWorkingDays, int MaxHrsPerMonth)
{
CompanyEmpWageArray[numOfCompany] = new CompanyEmpWage(Company, EmpRatePerHr, NumOfWorkingDays, MaxHrsPerMonth);
numOfCompany++;
}

public void ComputeEmpWage()
{
	for(int i = 0; i < numOfCompany; i++)
	{
		int totalEmpWage = this.ComputeEmpWage(CompanyEmpWageArray[i]);
	        System.out.println("Total Employeewage for Company"+CompanyEmpWageArray[i].Company+ " is:"+totalEmpWage);

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
EmployeeWage empwageBuilder = new EmployeeWage();
empwageBuilder.addCompanyEmpWage("Amazon",20,2,10);
empwageBuilder.addCompanyEmpWage("FlipKart",10,4,20);
empwageBuilder.addCompanyEmpWage("FirstCry",20,4,15);
empwageBuilder.ComputeEmpWage();
}
}

