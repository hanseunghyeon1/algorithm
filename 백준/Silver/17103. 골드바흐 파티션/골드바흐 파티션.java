import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int k = 0; k < T; k++) {
			int n = Integer.parseInt(br.readLine());
			boolean[] arr = new boolean[n + 1];
			arr[0] = true;
			arr[1] = true;
			for (int i = 2; i <= n; i++) {
				if (arr[i] == true) {
					continue;
				}
				for (int j = i * 2; j <= n; j += i) {
					arr[j] = true;
				}
			}
			int cnt=0;
			int samecnt=0;
			for(int i=2; i<=n; i++) {
				if(!arr[i]&&!arr[n-i]) {
					if(i == n-i) {
						samecnt++;
					}else {
						cnt++;
					}
				}
			}
			cnt /= 2;
			bw.write(samecnt+cnt+"\n");
		}
		bw.flush();
		bw.close();
	}
}