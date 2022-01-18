//...Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo...//

package dsaPracticeQuestion.array;
import java.util.*;
public class SortingArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr =new int[n];
        int zero=0,one=0,two=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0)
                zero++;
            else if(arr[i]==1)
                one++;
            else
                two++;
        }
        int i=0;
        while(i<zero)
            arr[i++]=0;
        while(i<one+zero)
            arr[i++]=1;
        while(i<two+one+zero)
            arr[i++]=2;
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}