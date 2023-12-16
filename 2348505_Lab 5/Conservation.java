import java.util.Scanner;
interface WaterConservationSystem
{
    int CalculateTrappedWater(int[] blockheights);
}
abstract class RainySeasonConservation implements WaterConservationSystem
{
}
class CityBlockConservation extends RainySeasonConservation
{

    public int CalculateTrappedWater(int[] blockheights)
    {
        int n = blockheights.length;
        int start = blockheights[0];
        int end = blockheights[n-1];
        int sum=0;
            if(end>start)
            {
                for(int i=0;i<n-1;i++)
                {
                sum = sum+(start-blockheights[i]);
            }
        }
            else
            {
                for(int i=1;i<n;i++)
        {
                sum = sum+(end-blockheights[i]);
        }
        }
        return sum;
    }
}
class Conservation 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of blocks");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the height of the blocks");
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        CityBlockConservation obj = new CityBlockConservation();
        System.out.println("The total volumes of water that can be stored is:"+obj.CalculateTrappedWater(arr));

    }
}