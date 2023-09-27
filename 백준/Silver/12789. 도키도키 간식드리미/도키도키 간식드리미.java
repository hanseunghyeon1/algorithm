import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int N = Integer.parseInt(br.readLine());
       Queue<Integer> list = new LinkedList<>();
       StringTokenizer st = new StringTokenizer(br.readLine());
       Stack<Integer> stack = new Stack<>();
       int snack = 1;
       for(int i = 0; i < N; i++)
           list.add(Integer.parseInt(st.nextToken()));
       while(true){
           if(list.isEmpty()){
               if(stack.empty()){
                   bw.write("Nice");
                   break;
               }else{
                   if(stack.get(stack.size()-1) == snack){
                       stack.pop();
                       snack+=1;
                   }else{
                       bw.write("Sad");
                       break;
                   }
               }
           }else {
               if(snack == list.peek()){
                   snack += 1;
                   list.remove();
               }else{
                   if(stack.empty()){
                       stack.push(list.poll());
                   }else{
                       if(snack == stack.get(stack.size()-1)){
                           snack += 1;
                           stack.pop();
                       }else{
                           stack.push(list.poll());
                       }
                   }
               }
           }

       }
       bw.flush();
       bw.close();
       br.close();
    }
}
