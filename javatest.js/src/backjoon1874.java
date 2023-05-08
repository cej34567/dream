import java.util.Scanner;
import java.util.Stack;

public class backjoon1875{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Stack<Integer>  stack = new Stack<>();
        int start = 1;
        StringBuffer sb = new StringBuffer();
        boolean check = true;
        for(int i=0; i<n; i++){
            if(arr[i]>= start){
                while(arr[i]>=start){
                    stack.push(start++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }else{
                int pop = stack.pop();
                if(pop>arr[i]){
                    System.out.print("NO");
                    check = false;
                    break;
                }else{
                    sb.append("-\n");
                }
            }
        }
        if(check) System.out.println(sb.toString());

    }
}