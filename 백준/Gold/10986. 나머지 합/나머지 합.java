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
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		st = new StringTokenizer(br.readLine());
		long[] arr = new long[1000];
		long sum = 0;
		long cnt = 0;
		long a;
		for(int i =0; i<N; i++) {
			a = Integer.parseInt(st.nextToken());
			sum += a;
			sum %= M;
			cnt += arr[(int) sum];
			arr[(int) sum]++;
			if(sum==0) cnt++;
		}
		bw.write(cnt+"");
		bw.flush();
		bw.close();
	}
}