/*Sample Input

java 100
cpp 65
python 50

Sample Output

================================
java           100 
cpp            065 
python         050 
================================

Explanation

Each String is left-justified with trailing whitespace through the first 15
characters. The leading digit of the integer is the 16th character, and each integer that was less 3 than digits now has leading zeroes.*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s", s1);
                if (x < 10 ) {
                 System.out.println("00"+x);
                } else if ((x >= 10) && (x < 100)){
                 System.out.println("0"+x);
                } else {
                System.out.println(x);
                }
            }
            System.out.println("================================");

    }
}

