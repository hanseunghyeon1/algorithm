import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = 5;
		int sum = 9;
		int x = 1;
		int N = Integer.parseInt(br.readLine());
		for(int i=1; i<N; i++) {
			a = a*4 - 4*x;
			x = x*2;
			sum += a;
		}
		bw.write(sum+"");
		bw.flush();
		bw.close();
	}
}