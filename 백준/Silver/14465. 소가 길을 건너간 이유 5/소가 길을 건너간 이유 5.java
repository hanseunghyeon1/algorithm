import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
 
    static int N, K, B;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
 
        int[] sum = new int[N + 1];
        boolean[] isBroken = new boolean[N + 1];
        for (int i = 0; i < B; i++) {
            isBroken[Integer.parseInt(br.readLine())] = true;
        }
        
        int cnt = 0;
        for (int i = 1; i <= K; i++) {
            if(isBroken[i]) cnt++;
        }
        sum[K] = cnt;
        int res = cnt;

        for (int i = K + 1; i <= N; i++) {
            int tmp = sum[i - 1];
            if(isBroken[i]) tmp++;
            if(isBroken[i - K]) tmp--;
            sum[i] = tmp;
            res = Math.min(res, tmp);
        }
        System.out.println(res);
    }
 
}
