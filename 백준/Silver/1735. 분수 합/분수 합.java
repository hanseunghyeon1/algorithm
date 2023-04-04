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
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int n = geta(B, D);
		int bunsu = B * D / n;
		int bunja = bunsu/B*A+bunsu/D*C;
		n = geta(bunsu, bunja);
		bunsu = bunsu/n;
		bunja = bunja/n;
		bw.write(bunja+" "+bunsu);
		bw.flush();
		bw.close();
	}

	public static int geta(int A, int B) {
		int r;
		while (B != 0) {
			r = A % B;
			A = B;
			B = r;
		}
		return A;
	}
}