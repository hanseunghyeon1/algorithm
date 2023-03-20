import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[9];
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			arr[i] = N;
		}
		int max = arr[0];
		int count = 1;
		for(int i=1; i<9; i++) {
			if(max<arr[i]) {
				max = arr[i];
				count = i+1;
			}
		}
		bw.write(max+"\n"+count);
		
		bw.flush();
		bw.close();
	}
}