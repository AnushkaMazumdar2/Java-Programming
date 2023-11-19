import java.util.*;
public class ShareTrader
{
static int maxProfit;
public static void findMaxProfit(int[] price)
{
     maxProfit = 0;
    int n = price.length;
    int[] profit = new int[n];
    int min = price[0];
for(int i = 1;i<n;i++)
{
        min = Math.min(min,price[i]);
        profit[i] = Math.max(profit[i-1],price[i]-min);
}
int max = price[n-1];
int maxProfit = profit[n-1];    
for(int i=n-2;i>0;i--)
{
    max = Math.max(max,price[i]);
    maxProfit= Math.max(maxProfit,profit[i-1]+max -price[i]);
}
System.out.println(maxProfit);
}
public static boolean stock(int[] price)
{
    boolean value = true;
    for(int i=0;i<price.length-1;i++)
    {
        if(price[i]<=price[i+1])
        {
        value = false;
        break;
        }
    }
    return value;
}
public static void main(String args[])
{
    ShareTrader obj = new ShareTrader();
    int arr[] = {10, 22, 5, 75, 65, 80};
    boolean result = stock(arr);
    if(result==true)
    {
        System.out.println("All the stock prices are decreasing in the day. No way to earn");
    }
    else
    {
        obj.findMaxProfit(arr);
    }
}
}
