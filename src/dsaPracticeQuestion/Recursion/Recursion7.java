/*To calculate x^n using Recursion(stack height= logn)*/
package dsaPracticeQuestion.Recursion;

public class Recursion7 {
    public static int calpow(int x, int n){
        if(n==0){ //base case 1
            return 1;
        }
        if(x==0){// base case 2
            return 0;
        }

        //if n is even
        if(n%2==0)
            return calpow(x,n/2) * calpow(x, n/2);
        //if n is odd
        else
            return calpow(x,n/2) * calpow(x,n/2) *x;
    }

    public static void main(String[] args) {
        int x=2, n=5;
        int ans = calpow(x,n);
        System.out.println(ans);

    }
}
