import java.util.*;
class Employee
{
int employeeId;
String employeeName, designation;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a valid EmployeeID");
employeeId = sc.nextInt();
System.out.println("Enter an Employee Name");
employeeName = sc.next();
System.out.println("Enter the Employee's Designation");
designation = sc.next();
public void calculateBonus()
{
}
}
class HourlyEmployee extends Employee
{
public double WeeklyEarnings(double hourlyrate, int hoursWorked)
{
double earnings = hourlyrate * hoursWorked;
return earnings;
}
public void calculateBonus()
{
}
}
class SalariedEmployee extends Employee
{
public double WeeklySalary(double Monthlysalary)
{
double salary = MonthlySalary/4;
return Monthlysalary;
}
}
class ExecutiveEmployee extends SalariedEmployee
{
double bonusPercentage;
public double calculateBonus(double bonusPercentage, double Monthlysalary)
{
super(MonthlySalary);
double bonus = bonusPercentage*MonthlySalary;
return bonus
}
}
public static void main(String args[])
{
HourlyEmployee h = new HourlyEmployee();
SalariedEmployee s = new SalariedEmployee();
ExecutiveEmployee e = new ExecutiveEmployee();
Scanner sc = new Scanner(System.in);

