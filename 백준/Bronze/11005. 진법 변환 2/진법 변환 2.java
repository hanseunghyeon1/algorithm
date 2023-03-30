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
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long sum = 0;
		int i = 0;
		while (true) {
			if (Math.pow(B, i) > A)
				break;
			i++;
		}
		long b = A;
		for (int j = i-1; j >= 0; j--) {
			int a = (int) (b / Math.pow(B, j));
			b = (int) (b - a * Math.pow(B, j));
			if(a>=10) {
				bw.write((char)(a-10+'A'));
			}else {
				bw.write(a+"");
			}
		}


		bw.flush();
		bw.close();
	}
}
