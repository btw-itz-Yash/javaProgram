package dsaPracticeQuestion.Recursion;

public class Recursion2 {
    public static void PrintNum(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        PrintNum(n+1);
    }
    public static void main(String[] args) {
        int n =1;
        PrintNum(n);
    }
}
