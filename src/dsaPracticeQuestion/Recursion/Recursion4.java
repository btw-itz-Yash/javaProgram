/*Print Factorial of a Given No.*/
package dsaPracticeQuestion.Recursion;

import java.util.*;
public class Recursion4 {
    public static int calFact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm = calFact(n-1);
        int fact_n = n * fact_nm ;
        return fact_n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = calFact(n);
        System.out.println(ans);
    }
}
