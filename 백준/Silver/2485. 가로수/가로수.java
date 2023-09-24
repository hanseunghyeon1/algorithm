import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++)
            list.add(Integer.parseInt(br.readLine()));
        List<Integer> distanceList = new ArrayList<>();
        int gcdNum = 0;
        for(int i = N-1; i > 0; i--){
            int distance = list.get(i) - list.get(i-1);
            gcdNum = gcd(distance, gcdNum);
        }
        bw.write((list.get(N-1)-list.get(0))/gcdNum+1 - N + "");
        bw.flush();
        bw.close();
        br.close();
    }
    private static int gcd(int a, int b) {
        return b!=0 ? gcd(b, a%b) : a;
    }
}
