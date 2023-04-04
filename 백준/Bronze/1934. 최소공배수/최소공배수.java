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
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int A = 0;
		int B = 0;
		int n = 0;
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			n = geta(A,B);
			bw.write((A*B)/n+"\n");
		}
		bw.flush();
		bw.close();
	}
	public static int geta(int A, int B) {
		int r;
		while(B!=0) {
			r = A%B;
			A = B;
			B = r;
		}
		return A;
	}
}