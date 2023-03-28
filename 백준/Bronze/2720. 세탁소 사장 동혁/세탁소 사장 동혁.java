import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int C = 0;
		int[] arr = new int[4]; 
		for(int i=0; i<T; i++) {
			C = Integer.parseInt(br.readLine());
			arr[0] = C/25;
			arr[1] = C%25/10;
			arr[2] = C%25%10/5;
			arr[3] = C%25%10%5;
			for(int j : arr)
				bw.write(j+" ");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}