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
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				if(j==0) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}else {
					arr[i][j] = arr[i][j-1]+Integer.parseInt(st.nextToken());
				}
			}
		}
		int K = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=0; i<K; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			int c = Integer.parseInt(st.nextToken())-1;
			int d = Integer.parseInt(st.nextToken())-1;
			for(int j=a; j<=c; j++) {
				if(b==0) {
					sum += arr[j][d];
				}else {
					sum += arr[j][d]-arr[j][b-1];
				}
			}
			bw.write(sum+"\n");
			sum = 0;
		}
		bw.flush();
		bw.close();
	}

}
