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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int A;
		int B;
		StringTokenizer st1;
		String str;
		for(int i=0; i<N; i++) {
			st1 = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st1.nextToken());
			B = Integer.parseInt(st1.nextToken());
			str = String.format("Case #%d: %d + %d = %d",
					i+1, A, B, A+B);
			if(i==N-1) bw.write(str+"");
			else bw.write(str+"\n");
		}
		bw.flush();
		bw.close();
	}
}