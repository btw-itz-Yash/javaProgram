/*Print sum of first n natural number*/
package dsaPracticeQuestion.Recursion;
import java.util.*;
public class Recursion3 {
    public static int s=0;
    public static void printSum(int n){
        if(n==0){
            System.out.println(s);
            return;
        }
        s=s+n;
       printSum(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSum(n);
    }
}
