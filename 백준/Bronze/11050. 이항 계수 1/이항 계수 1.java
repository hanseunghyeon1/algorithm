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
		int K = Integer.parseInt(st.nextToken());
		int nfac = 1;
		int rfac = 1;
		int nmrfac = 1;
		for(int i=1; i<=N; i++) {
			nfac *= i;
		}
		for(int i=1; i<=K; i++) {
			rfac *= i;
		}
		for(int i=1; i<=N-K; i++) {
			nmrfac *= i;
		}
		bw.write(nfac/(rfac*nmrfac)+"");
		bw.flush();
		bw.close();
	}
}
