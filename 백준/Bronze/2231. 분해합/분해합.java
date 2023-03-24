import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int sum =99;
		int a = 0;
		int cnt = 0;
		for(int j=N-sum; j<N; j++) {
			if(j>0) {
				for(int k=0; k<String.valueOf(j).length(); k++) {
					a += Integer.parseInt(String.valueOf(String.valueOf(j).charAt(k)));
				}
				if(a+j == N) {
					cnt++;
					bw.write(j+"");
					break;
				}
				a=0;
			}
		}
		if(cnt == 0)
			bw.write(0+"");
		bw.flush();
		bw.close();
	}
}