import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[][] arr = new int[100][100];
		int x;
		int y;
		int sum = 0;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					arr[j][k] = 1;
				}
			}
		}
		for(int j=0; j<100; j++) {
			for(int k=0; k<100; k++) {
				sum += arr[j][k];
			}
		}
		bw.write(sum+"");
		bw.flush();
		bw.close();
	}
}