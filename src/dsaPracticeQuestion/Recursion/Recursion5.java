package dsaPracticeQuestion.Recursion;

public class Recursion5 {
    public static void printFib(int a, int b, int n){
        if(n==0){
            return ;
        }
        int c = a+b;
        System.out.print(c+" ");
        a = b;
        b = c;
        printFib(a, b, n-1);
    }
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a +" "+b+" ");
        int n = 10;
        printFib(a,b,n-2);
    }
}
