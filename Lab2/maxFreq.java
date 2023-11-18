import java.util.*;
class MaxFreq
{
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array");
n = sc.nextInt();
static int[] arr = new int[n];
System.out.println("Enter the numbers");
for (int i=0; i<arr.length;i++)
{
arr[i] = sc.nextInt();
}
public static maxFrequency(int k)
{
int[] sorted_arr = new int[k];
freq <Integer,Integer> freq = new HashMap<>();
int max =0;
for (int i = 0;i<arr.length;i++)
{
int c=0;
for(int j=0;j<arr.length;j++)
{
if(arr[i] == arr[j])
{
c++
}
}
if (c>max)
{
max = c;
arr[i] = arr[i];
}import java.util.*;
class MaxFreq
{
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array");
n = sc.nextInt();
static int[] arr = new int[n];
System.out.println("Enter the numbers");
for (int i=0; i<arr.length;i++)
{
arr[i] = sc.nextInt();
}
public static maxFrequency(int k)
{
ArrayList<Integer> sorted_arr = new ArrayList<>();
int[] final = new int[n];
Arrays.fill(final,-1)
int max =0;
for (int i = 0;i<arr.length;i++)
{
int c=1;
for(int j =0;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
c = c+1;
}
}
if(c>max)
{
max = c;
sorted_arr.add(arr[i]);
}
}
}
for(int i=0;i<sorted_arr.size();i++)
{




public static void main(String[] args)
{
    MaxFreq obj = new MaxFreq();
    obj.maxFrequency(k);
    
}





