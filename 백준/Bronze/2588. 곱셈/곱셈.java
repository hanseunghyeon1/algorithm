import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
       
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st1.nextToken());
        int B = Integer.parseInt(st2.nextToken());
        bw.write(A*((B%100)%10)+"\n");
        bw.write(A*((B%100)/10)+"\n");
        bw.write(A*(B/100)+"\n");
        bw.write(A*B+"");
        bw.flush();
        bw.close();
	}
}
