import java.util.*;
public class maxFreq {    
    static int[] arr;
    public static void maxFrequency(int K) {
        if (arr == null || arr.length < K) {
            System.out.println("Invalid input");
        }
        int[] sorted_arr = new int[arr.length];
        int[] freq = new int[arr.length];
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isNewNumber = true;
            for (int j = 0; j < c; j++) {
                if (arr[i] == sorted_arr[j]) {
                    freq[j]++;
                    isNewNumber = false;
                    break;
                }
            }
            if (isNewNumber==true) {
                sorted_arr[c] = arr[i];
                freq[c] = 1;
                c++;
            }
        }
        for (int i = 0; i < c - 1; i++) {
            for (int j = i + 1; j < c; j++) {
                if (freq[i] < freq[j] || (freq[i] == freq[j] && sorted_arr[i] < sorted_arr[j])) {
                    // Swap freq and arr
                    int tempFreq = freq[i];
                    freq[i] = freq[j];
                    freq[j] = tempFreq;
                    int tempNum = sorted_arr[i];
                    sorted_arr[i] = sorted_arr[j];
                    sorted_arr[j] = tempNum;
                }
            }
        }
        for (int i = 0; i < K; i++) {
            System.out.print(sorted_arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int n = sc.nextInt();
            arr = new int[n];
        System.out.println("Enter numbers");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter desired number of top frequencies to be displayed");
        int k = sc.nextInt();
        maxFrequency(k);
    }
}
