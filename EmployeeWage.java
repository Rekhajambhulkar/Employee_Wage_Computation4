public class EmployeeWage 
{

//CONSTANTS
public static final int IS_FULL_TIME=1;
public static final int IS_PART_TIME=0;
p0ubilc
//Define static method to calculate Employee Wage for multiple Companies
public static int CalcEmpWageForCompany(String Company, int EmpRatePerHr, int NumOfDays, int MaxHrs)
{
//variables
int totalEmpHours=0;
int empHrs=0;
int totalWorkingDays=0;

//Display the Welcome Message
System.out.println("Welcome to the EmployeeWage Program");

//Calculate Wages till total working hrs or days is reached for a month
while(totalEmpHours <= MaxHrs && totalWorkingDays <  NumOfDays )
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

//Display total EmployeeWage per hour
int totalEmpWage= totalEmpHours * EmpRatePerHr;
System.out.println("Total Employee Wage for Company:"+Company+ "is:"+totalEmpWage);
return totalEmpWage;
}

public static void main(String[] args) {
	
//EmployeeWage for Multiple Companies
int totalwage = CalcEmpWageForCompany("BridgeLabz",20,3,10);
CalcEmpWageForCompany("Thoughtworks",25,4,20);
CalcEmpWageForCompany("Capgemini", 30,3,20);
CalcEmpWageForCompany("Amazon",20,4,10);
}
}
