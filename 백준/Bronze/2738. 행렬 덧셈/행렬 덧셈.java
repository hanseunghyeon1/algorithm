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
		int M = Integer.parseInt(st.nextToken());
		int[][] arr1 = new int [N][M];
		int[][] arr2 = new int [N][M];
		int[][] ans = new int [N][M];
		for(int i=0; i<arr1.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<arr1[i].length; j++)
				arr1[i][j] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<arr1.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<arr1[i].length; j++)
				arr2[i][j] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				ans[i][j] = arr1[i][j]+arr2[i][j];
				bw.write(ans[i][j]+" ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
}