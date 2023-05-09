import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class backjoon11286 {
    public static void main(String[] args) throws IOException{
        /*배열에 정수를 넣고 
         * 배열에서 절대값이 가장 작은 값을 출력하고 그 값을 제거한다.
         * 절대값이 가장 작은 값이 여러개라면 그 중 가장 작은 값을 출력 후 제거한다.
         * 입력되는 값의 범위는 -231~+231
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
           //절댓값 작은 데이터 우선
           //절댓값이 같은 경우 음수 우선
           int frist_abs = Math.abs(o1);
           int second_abs = Math.abs(o2);

           //절댓값이 같은 경우
           if(frist_abs == second_abs) return o1>o2 ? 1 : -1;
           return frist_abs - second_abs; 
        });

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0){
                if(pq.isEmpty()) System.out.println("0");
                else System.out.println(pq.poll());
            }else{
                pq.add(num);
            }
        }
    }
}
