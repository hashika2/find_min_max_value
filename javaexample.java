import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long sum=0;
       // int summin=0;
        long min=arr[0];
    long max=arr[0];
        for(int i=0;i<5;i++){
            if(min>arr[i]){
                min=arr[i];
            }
           if(max<arr[i]){
               max=arr[i];
            }
        }
        
        for(int j=0;j<5;j++){
            sum=sum+arr[j];
           // summax=summax+arr[j];
        }
        System.out.println((sum-max)+" "+(sum-min));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
