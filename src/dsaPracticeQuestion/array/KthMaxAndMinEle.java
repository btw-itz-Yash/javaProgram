package dsaPracticeQuestion.array;
//Find the "Kth" max and min element of an array

import java.util.*;

public class KthMaxAndMinEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int k =sc.nextInt();
        //for kth maximum element in an array
        System.out.println(k+"th maximum element in an array is "+ arr[n-k]);
        //for kth minimum element in an array
        System.out.println(k+"th minimum element in an array is "+ arr[k-1]);
    }
}
