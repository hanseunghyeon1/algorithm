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
		int[][] arr = new int[N][N];
		int a;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				a = Integer.parseInt(st.nextToken());
				if (j == 0) {
					arr[i][j] = a;
				}else {
					arr[i][j] = arr[i][j-1]+a;
				}
			}
		}
		int sum = 0;
		for(int i =0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for(int j = x1-1; j<x2; j++) {
				if(y1==1) {
					sum+= arr[j][y2-1];
				}else {
					sum+=(arr[j][y2-1]-arr[j][y1-2]);
				}
			}
			bw.write(sum+"\n");
			sum=0;
		}
		
		
		bw.flush();
		bw.close();
	}
}