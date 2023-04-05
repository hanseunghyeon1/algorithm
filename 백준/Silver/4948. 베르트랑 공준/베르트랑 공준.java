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
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			int[] arr = new int[2*n+1];
			for(int i=0; i<=n*2; i++) {
				arr[i] = i; 
			}
			arr[1] = 0;
			for(int i=2; i<=n*2; i++) {
				if(arr[i]==0) {
					continue;
				}
				for(int j=i*2; j<=n*2; j+=i) {
					arr[j] = 0;
				}
			}
			int count = 0;
			for(int i=n+1; i<=2*n; i++) {
				if(arr[i] != 0)
					count++;
			}
			bw.write(count+"\n");
		}
		bw.flush();
		bw.close();
	}
}