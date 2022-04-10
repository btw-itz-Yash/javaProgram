/*To calculate x^n using Recursion*/
package dsaPracticeQuestion.Recursion;

public class Recursion6 {
    public static int calpow(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPownm1 = calpow(x,n-1);
        int xPown = x * xPownm1;
        return xPown;
    }
    public static void main(String[] args) {
        int x=2, n=5;
        int ans = calpow(x,n);
        System.out.println(ans);
    }
}
