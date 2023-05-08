import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class backjoon12891 {
    static int[] check = new int[4];
    static int[] num = new int[4];
    public static void main(String[] args) throws IOException{
        //DNA문자열 : {'A', 'C', 'G', T}로만 구성된 문자열
        /* 1. 비밀번호로 사용할 부분 문자열의 길이, 부문 문자열의 길이
         * 3. DNA문자열
         * 4. 부분 문자열에 포함돼야할 각 문자의 최소 개수
         * => 조합할수 있는 부분 문자열의 개수
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //1
        int m = Integer.parseInt(st.nextToken()); //2
        char[] ch = new char[n];
        ch = br.readLine().toCharArray(); //3
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++) num[i] = Integer.parseInt(st.nextToken());
        int res =0;
        for(int i=0; i<m; i++){
            if(ch[i]=='A') check[0]++;
            else if(ch[i]=='C') check[1]++;
            else if(ch[i]=='G') check[2]++;
            else if(ch[i]=='T') check[3]++;
        }
        if(checkNum()) res++;
        int j=-1;
        for(int i=m; i<n; i++){
            j = i-m;
            if(ch[j]=='A') check[0]--;
            else if(ch[j]=='C') check[1]--;
            else if(ch[j]=='G') check[2]--;
            else if(ch[j]=='T') check[3]--;

            if(ch[i]=='A') check[0]++;
            else if(ch[i]=='C') check[1]++;
            else if(ch[i]=='G') check[2]++;
            else if(ch[i]=='T') check[3]++;

            if(checkNum()) res++;
        }
        
        System.out.print(res);

    }
    public static boolean checkNum(){
        for(int i=0; i<4; i++){
            if(check[i]<num[i]) return false;
        }
        return true;
    }
}
