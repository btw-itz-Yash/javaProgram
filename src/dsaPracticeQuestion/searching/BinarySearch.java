package dsaPracticeQuestion.searching;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch(int []arr,int i,int j,int x) {
        if(i==j){
            if(arr[i]==x)
                return i;
        }
        else{
            int mid=(i+j)/2;
            if(arr[mid]==x) return mid;
            else if (arr[mid]>x)
                return binarySearch(arr, i, mid-1, x);
            else
                return binarySearch(arr, mid+1, j, x);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int []arr = new int[n+1];
        System.out.println("Enter array element");
        for(int i=1;i<=n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter element to search");
        int x = sc.nextInt();
        Arrays.sort(arr);
        int i=1;
        int ans = binarySearch(arr,i,n,x);
        System.out.println("no. found at position "+ans);
    }
}
