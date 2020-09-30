import java.util.*;
import java.lang.*;
public class peak {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int flag1=0,flag2=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int[] maxLeft = new int[n];
        maxLeft[0] = arr[0];
        for(int i=1;i<n;i++){
            maxLeft[i] = Math.max(arr[i] , maxLeft[i-1]);
        }
        int[] minRight = new int[n];
        minRight[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
            minRight[i] = Math.min(minRight[i+1],arr[i]);
        
        boolean ans = false;
        for(int i=1;i<n-1;i++){
            if( arr[i] > maxLeft[i-1] && arr[i]<minRight[i+1]){
                    ans = true;
                    break;
            }
        }

        System.out.println(ans?"1":"0");

    }
}