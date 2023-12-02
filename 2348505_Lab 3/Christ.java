import java.util.*;
//Defining the base class
class Employee
{
//Initialising the variables
int employeeId;
String employeeName, designation;
//Calling the class constructor
public Employee(int employeeId, String employeeName, String designation) 
{
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
    }
//Initialising a method
public double calculateBonus()
{
return 0.0;
}
//Initialising a method
public double annualEarnings()
{
    return 0.0;
}
}
class HourlyEmployee extends Employee
{
double hourlyrate,earnings=0.0;
int hoursWorked;
public HourlyEmployee(int employeeId, String employeeName, String designation)
{
//Using the super keyword to call the base constructor
    super(employeeId, employeeName, designation);
   this.hourlyrate = hourlyrate;
    this.hoursWorked = hoursWorked;
}
// Calculating the Weekly Earnings
public double WeeklyEarnings(double hourlyrate, int hoursWorked)
{ 
return hourlyrate * hoursWorked;
}
//Calculating the Bonus
public double calculateBonus(double hourlyrate, int hoursWorked)
{
    return 0.02*WeeklyEarnings(hourlyrate,hoursWorked);
}
//Calculating hourly rate
public double annualEarnings(double hourlyrate, int hoursWorked)
{
    return (calculateBonus()+(hourlyrate * hoursWorked))*48;
}
}
class SalariedEmployee extends Employee
{
double Monthlysalary,salary=0.0;
public SalariedEmployee(int employeeId, String employeeName, String designation)
{
//Calling the base class Employee
    super(employeeId, employeeName, designation);
    this.Monthlysalary = Monthlysalary;
}
//Calculating weekly salary
public double WeeklySalary(double Monthlysalary)
{
double salary = Monthlysalary/4;
return salary;
}
//Calculating Annual Earnings
public double annualEarnings(double Monthlysalary)
{
return Monthlysalary*12;   
}
}
class ExecutiveEmployee extends SalariedEmployee
{
double bonusPercentage;
public ExecutiveEmployee(int employeeId, String employeeName, String designation)
{
// Calling the base class Employee
    super(employeeId, employeeName, designation);
    this.bonusPercentage = bonusPercentage;
    this.Monthlysalary = Monthlysalary;
}
// Calculating the bonus for executive employees
public double calculateBonus(double bonusPercentage, double Monthlysalary)
{
return ((bonusPercentage/100)*Monthlysalary);
}
}
public class Christ
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int id,c;
String name,desg;
// Taking input values from the user
System.out.println("Choose 1 for Hourly Employee Details and 2 for Executive Employee Details");
c=sc.nextInt();
System.out.println("Enter a valid EmployeeID");
id = sc.nextInt();
System.out.println("Enter an Employee Name");
name = sc.next();
System.out.println("Enter the Employee's Designation");
desg = sc.next();
HourlyEmployee h = new HourlyEmployee(id,name,desg);
SalariedEmployee s = new SalariedEmployee(id,name,desg);
ExecutiveEmployee e = new ExecutiveEmployee(id,name,desg);
// Displaying information for Hourly Employees
if(c==1)
{
    double hrate;
    int hours;
    System.out.println("Enter hourly rate");
    hrate = sc.nextDouble();
    if(hrate<=0)
    {
    System.out.println("Enter a valid hourly rate (in Rupees)");
    }
    System.out.println("Enter the total hours worked in a week");
    hours = sc.nextInt();
    if(hours<=0 || hours>54)
    {
        System.out.println("Tiring working conditions. Enter Valid hours");
    }
    System.out.println("The employee details are:");
    System.out.println("Employee ID: "+id);
    System.out.println("Employee Name: "+name);
    System.out.println("The Weekly Earnings of the Employee is: "+h.WeeklyEarnings(hrate,hours));
    System.out.println("The Calculated Bonus is: "+h.calculateBonus(hrate,hours));
    System.out.println("The Annual Earnings is: "+h.annualEarnings(hrate,hours));
}
//Displaying information of Salaried Employees
else if(c==2)
{
    double msalary,bonusper;
    System.out.println("Enter the monthly salary of the employee");
    msalary = sc.nextDouble();
    System.out.println("Enter the Bonus Percentage");
    bonusper = sc.nextDouble();
    System.out.println("The Employee Details are:");
    System.out.println("Employee ID"+id);
    System.out.println("Employee Name"+name);
    System.out.println("The Weekly Salary of the Employee is"+s.WeeklySalary(msalary));
    System.out.println("The Calculated Bonus is: "+e.calculateBonus(msalary,bonusper));
    System.out.println("The Annual Earnings is: "+s.annualEarnings(msalary));
    double total = e.calculateBonus(msalary,bonusper) + s.annualEarnings(msalary);
    System.out.println("The Total Payroll is: "+total);
}
else
{
    System.out.println("Incorrect Input");
}
}
}