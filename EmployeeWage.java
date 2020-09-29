public class EmployeeWage 
{

//CONSTANTS
public static final int Is_Employee_Present=1;
public static final int EMP_RATE_PER_HOUR=20;
public static final int IS_FULL_TIME=1;
public static final int IS_PART_TIME=0;
public static final int WORKINGDAY_PER_MONTH=20;

public static void main(String[] args)
{
//variables
int totalEmpHours=0;
int empHrs=0;
int totalWorkingDays=0;


//Display the Welcome Message
System.out.println("Welcome to the EmployeeWage Program");

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
}
}
