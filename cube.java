import java.util.*;
public class cube{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[][] c = new char[n][n];
        for(int i = 0; i < n;i++){
            String s = sc.nextLine();
            s.trim().replace(" ","");
            c[i] = s.toCharArray();
        }
        int count = 0; 
        for(char[] i:c){
            for(char j:i){
                if(j=='D')
                    count ++;
            }
        }
        double ans = Math.sqrt(count);
        ans = Math.floor(ans);
        System.out.print((long)ans);
    }

}