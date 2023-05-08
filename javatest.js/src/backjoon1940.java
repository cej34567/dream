import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class backjoon1940 {
    public static void main(String[] args) throws IOException{
        /*입력값 : n - 재료의 개수
          m : 갑옷을 만드는데 필요한 수
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) num[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(num); //배열 정렬

        int s = 0, e = n-1, res=0;
        while(s<e){
            if(num[s]+num[e]==m){
                res++;
                s++; e--;
            }else if(num[s]+num[e]>m){
                e--;
            }else s++;
        }
        System.out.print(res);
    }
}
