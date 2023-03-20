import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int arr[] = new int[28];
		int num1 = 1;
		int num2 = 1;
		for(int i=0; i<28; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		for(int i=0; i<28; i++) {
			if(arr[i] == i+1) {
				num1++;
			}
			if(arr[i] == i+2) {
				num2++;
			}
			
		}
		num2 += num1;
		bw.write(num1+"\n"+num2);
		bw.flush();
		bw.close();
	}
}