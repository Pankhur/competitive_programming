/*
*
* program to find addition of two number from input array is equal to input number
********************************************************/
import java.util.*;
import java.io.*;
public class Main
{
    
    
    public static boolean summation(int finalsum, String[] arr) {
        int arr_length = arr.length;
        int for_while = arr_length;
        while(for_while != 0){
            int last_value = Integer.parseInt(arr[for_while-1]);
        for(int i=0;i<arr_length;i++) {
         if(last_value != Integer.parseInt(arr[i])) {
             int result_sum = last_value + Integer.parseInt(arr[i]);
             System.out.println("last_value " + last_value + " array_value " + arr[i] + " result sum " + result_sum);
             if(result_sum == finalsum){
                 return true;
             }
         }   
        }
        for_while--;
        }
        return false;
    }
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    String b = scan.next();
	    String[] c = b.split(",");
	    boolean sum_is = summation(a,c);
		if (sum_is) {
		System.out.println("yes sum exist");
		} else {
		System.out.println("no sum not exist"); 
		}
	}
}

