package Functions;

public class Sum {
    //A FUNCTION to calculate sum of 2 numbers - a & b
    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        sum(a, b); // Function Call

    }
}

