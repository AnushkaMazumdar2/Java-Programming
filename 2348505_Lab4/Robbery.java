//Importing all libraries from the util package
import java.util.*;
abstract class Robber
{
void RobbingClass()
{
//Printing
System.out.println("MScAI&ML");
}
void MachineLearning()
{
System.out.println("I love MachineLearning");
}
//Declaring all the abstract classes without any definition
abstract int RowHouses(int[] array);
abstract int RoundHouses(int[] array);
abstract int SquareHouse(int[] array);
abstract int MultiHouseBuilding(int[] arrays);
}
class JAVAProfessionalRobber extends Robber
{
//Overriding the abstract method
int RowHouses(int[] array)
{
int n = array.length;
if (n == 0) 
return 0;
if (n == 1) 
return array[0];
int min = array[0];
//Comparing the max values
int max = Math.max(array[0], array[1]);
for (int i = 2; i < n; i++) 
{
int current = Math.max(max, min + array[i]);
min = max;
max = current;
}
return max;
}
int RoundHouses(int[] array)
{
int n = array.length;
if (n == 0) return 0;
if (n == 1) return array[0];
//Using a user defined method to create a recursive method
int sum1 = RowHouses(sliceArray(array,1, n));
int sum2 = RowHouses(sliceArray(array,0, n - 1));
// Calculating the max amount that can be stolen
return Math.max(sum1, sum2);
}
int SquareHouse(int[] array)
{
int n = array.length;
if (n == 0) 
return 0;
if (n == 1) 
return array[0];
int min = array[0];
int max = Math.max(array[0], array[1]);
for (int i = 2; i < n; i++) {
int current = Math.max(max, min + array[i]);
min = max;
max = current;
}
return max;
}
int MultiHouseBuilding(int[] arrays)
{
#I have taken multi square buildings
int n = arrays.length;
if (n == 0) 
return 0;
if (n == 1) 
return arrays[0];
int min = arrays[0];
int max = Math.max(arrays[0], arrays[1]);
for (int i = 2; i < n; i++) 
{
int current = Math.max(max, min + arrays[i]);
min = max;
max = current;
}
return max;
}
//Creating a user defined method to slice arrays
private int[] sliceArray(int[] array, int start, int end) 
{
int[] result = new int[end - start];
for (int i = start; i < end; i++) 
{
result[i - start] = array[i];
}
return result;
}
}
public class Robbery
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
//Accepting user inputs
System.out.println("Enter the number of houses");
int n = sc.nextInt();
System.out.println("Enter the amount for row house");
int[] row = new int[n];
for(int i = 0;i<n;i++)
{
row[i] = sc.nextInt();
}
int[] round = new int[n];
System.out.println("Enter the amount for round house");
for(int i = 0;i<n;i++)
{
round[i] = sc.nextInt();
}
int[] square = new int[n];
System.out.println("Enter the amount for square house");
for(int i = 0;i<n;i++)
{
square[i] = sc.nextInt();
}
int[] multi_model = new int[6];
System.out.println("Enter the amount for Multi House house");
for(int i = 0;i<6;i++)
{
multi_model[i] = sc.nextInt();
}
//Creating an object of child class
JAVAProfessionalRobber obj = new  JAVAProfessionalRobber();
//Calling the abstract class methods
obj.RobbingClass();
obj.MachineLearning();
//Printing the amount stolen from row house
System.out.println("The maximum amount to be stolen from row house is:"+obj.RowHouses(row));
//Printing the amount stolen from round house
System.out.println("The maximum amount to be stolen from round house is:"+obj.RoundHouses(round));
//Printing the amount stolen from square house
System.out.println("The maximum amount to be stolen from square house is:"+obj.SquareHouse(square));
//Printing the amount stolen from multi house building
System.out.println("The maximum amount to be stolen from multi house building is:"+obj.MultiHouseBuilding(multi_model));
}
}