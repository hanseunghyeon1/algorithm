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
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long n = geta(A, B);
		bw.write((A * B) / n + "");
		bw.flush();
		bw.close();
	}

	public static long geta(long A, long B) {
		long r;
		while (B != 0) {
			r = A % B;
			A = B;
			B = r;
		}
		return A;
	}
}