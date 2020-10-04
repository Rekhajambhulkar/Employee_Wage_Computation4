public class EmployeeWage
{

//CONSTANTS
private static final int IS_FULL_TIME=1;
private static final int IS_PART_TIME=0;

private final int EmpRatePerHr;
private final int NumOfWorkingDays;
private final int MaxHrsPerMonth;
private String Company;
private int totalEmpWage;

//CONSTRUCTOR
public EmployeeWage(String Company, int EmpRatePerHr, int NumOfWorkingDays, int MaxHrsPerMonth)
{
this.Company = Company;
this.EmpRatePerHr = EmpRatePerHr;
this.NumOfWorkingDays = NumOfWorkingDays;
this.MaxHrsPerMonth = MaxHrsPerMonth;
}


//Define static method to calculate Employee Wage for multiple Companies
public void ComputeEmpWage()
{
//variables
int totalEmpHours=0;
int empHrs=0;
int totalWorkingDays=0;

//Display the Welcome Message
System.out.println("Welcome to the EmployeeWage Program");

//Calculate Wages till total working hrs or days is reached for a month
while(totalEmpHours <= MaxHrsPerMonth && totalWorkingDays <  NumOfWorkingDays)
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
totalEmpWage= totalEmpHours * EmpRatePerHr;
}

public String toString() {
return "Total Employee Wage for Company:"+Company+ "is:"+totalEmpWage;
}

public static void main(String[] args) {

//EmployeeWage for Multiple Companies
EmployeeWage Build1 = new EmployeeWage("Amazon" ,20,2,10);

EmployeeWage Build2 = new EmployeeWage("FlipCKart", 10, 4, 20);

EmployeeWage Build3 = new EmployeeWage("FirstCry", 25, 4, 15);


Build1.ComputeEmpWage();
System.out.println(Build1);

Build2.ComputeEmpWage();
System.out.println(Build2);

Build3.ComputeEmpWage();
System.out.println(Build3);
}
}
