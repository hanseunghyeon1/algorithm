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
		int[] arr = new int[N];
		int[] arr1 = new int[N];
		int a = 0;
		int b = 0;
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
			arr1[i] = i+1;
		}
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			for(int j=0; j<b-a+1; j++)
				arr[b-j-1] = arr1[a+j-1];
			for(int k=0; k<arr.length; k++)
				arr1[k] = arr[k];
		}
		for(int k=0; k<arr.length; k++)
			bw.write(arr[k]+" ");
		bw.flush();
		bw.close();
	}
}