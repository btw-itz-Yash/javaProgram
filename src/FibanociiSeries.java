import java.util.*;
public class FibanociiSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        long n1=0,n2=1;
        System.out.print(n1+" "+n2);
        for(int i=2;i<n;i++){
            long n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
