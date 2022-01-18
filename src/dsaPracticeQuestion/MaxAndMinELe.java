package dsaPracticeQuestion;

import java.util.*;
public class MaxAndMinELe {
    public static int max,min;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int []arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        if(n==1){
            min=max=arr[0];
        }
        else{
            if(arr[0]>arr[1]){
                max=arr[0];
                min=arr[1];
            }
            else{
                min=arr[0];
                max=arr[1];
            }
            for(int i=2;i<n;i++){
                if(arr[i]>max)
                    max=arr[i];
                else if(arr[i]<min)
                    min=arr[i];
            }
        }

        System.out.println("The maximum element in an array is "+max);
        System.out.println("The minimum element in an array is "+min);
    }
}
