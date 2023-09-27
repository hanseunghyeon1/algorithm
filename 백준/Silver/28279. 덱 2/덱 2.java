import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int N = Integer.parseInt(br.readLine());
       Deque<Integer> deque = new ArrayDeque<>();
       int x = 0;
       StringTokenizer st;
       for(int i = 0; i < N; i++){
           st = new StringTokenizer(br.readLine());
           int order = Integer.parseInt(st.nextToken());
           if(order == 1 || order == 2)
               x = Integer.parseInt(st.nextToken());
           dequePrint(deque, order, x, bw);
       }
       bw.flush();
       bw.close();
    }
    private static void dequePrint(Deque deque, int n, int x, BufferedWriter bw)
        throws IOException {
        switch (n){
            case 1:
                deque.addFirst(x);
                break;
            case 2:
                deque.addLast(x);
                break;
            case 3:
                if (deque.isEmpty()) {
                    bw.write(-1+"\n");
                }else{
                    bw.write(deque.pollFirst()+"\n");
                }
                break;
            case 4:
                if (deque.isEmpty()) {
                    bw.write(-1+"\n");
                }else{
                    bw.write(deque.pollLast()+"\n");
                }
                break;
            case 5:
                bw.write(deque.size()+"\n");
                break;
            case 6:
                if (deque.isEmpty()) {
                    bw.write(1+"\n");
                } else {
                    bw.write(0+"\n");
                }
                break;
            case 7:
                if (deque.isEmpty()) {
                    bw.write(-1+"\n");
                }else{
                    bw.write(deque.getFirst()+"\n");
                }
                break;
            case 8:
                if (deque.isEmpty()) {
                    bw.write(-1+"\n");
                }else{
                    bw.write(deque.getLast()+"\n");
                }
                break;
        }
    }
}
