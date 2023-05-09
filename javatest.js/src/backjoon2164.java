import java.util.*;
public class backjoon2164 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++) q.add(i);

        while(q.size()>1){
            q.poll(); //맨 앞의 값을 뺀다
            int num = q.poll(); //밑에 넣을 값
            q.add(num);
        }
        System.out.println(q.poll());
    }
}
