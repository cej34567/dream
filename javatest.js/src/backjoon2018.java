import java.util.*;
public class backjoon2018{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1, end = 1;
        int sum = start, cnt=1;

        while(end!=n){
            if(sum==n){
                cnt++; end++; sum+=end;
            }else if(sum>n){
                sum-=start; start++;
            }else{
                end++; sum+=end;
            }
        }
        System.out.print(cnt);
    }
}