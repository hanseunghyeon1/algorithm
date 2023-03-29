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
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int mean = 0;
		int sum = 0;
		int mid = 0;
		Arrays.sort(arr);
		mid = arr[2];
		for(int i=0; i<5; i++) {
			sum+=arr[i];
		}
		mean = sum/5;
		bw.write(mean+"\n"+mid);
		bw.flush();
		bw.close();
	}
}