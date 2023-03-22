import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int num = 0;
		int[] arr = new int[N];
		for(int i=1; i<N+1; i++) {
			if(N%i==0) {
				arr[num] = i;
				num++;
			}
		}
		bw.write(arr[K-1]+"");
		bw.flush();
		bw.close();
	}
}