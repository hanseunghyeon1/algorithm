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
		StringTokenizer st;
		int[][] arr = new int [9][9];
		for(int i=0; i<arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<arr[i].length; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int max = arr[0][0];
		int a = 1;
		int b = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++)
				if(max<arr[i][j]) {
					max = arr[i][j];
					a = i+1;
					b = j+1;
				}
		}
		bw.write(max+"\n"+a+" "+b);
		
		bw.flush();
		bw.close();
	}
}