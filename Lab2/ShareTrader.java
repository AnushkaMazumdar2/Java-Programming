import java.util.*;
public class ShareTrader
{
static int maxProfit;
public static void findMaxProfit(int[] price)
{
int[] buy = new int[2];
int[] sell = new int[2];
buy[1] = price[0];
sell[1] = price[1];
int profits;
profits = sell[1]-buy[1];
maxProfit += profits;
int min = price[2];
int max = price[2];
for(int i =2;i<price.length;i++)
{
if(price[i]<min)
{
min = price[i];
}
else if(price[i]>max)
{
max = price[i];
}
}
int profit = max - min;
maxProfit += profit;
System.out.println(maxProfit);
    
}

public static void main(String args[])
{
    ShareTrader obj = new ShareTrader();
    int arr[] = {2, 30, 15, 10, 8, 25, 80};
    obj.findMaxProfit(arr);
}
}