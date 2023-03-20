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
		int[] arr = new int[N];
		int[] ans = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			ans[i] = i+1;
		}
		int begin;
		int end;
		int mid;
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			begin = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			mid = Integer.parseInt(st.nextToken());
			System.arraycopy(arr, mid-1, ans, begin-1, end-mid+1);
			System.arraycopy(arr, begin-1, ans, begin+end-mid, mid-begin);
			for(int j=0; j<arr.length; j++)
				arr[j] = ans[j];
		}
		for(int i=0; i<ans.length; i++)
			bw.write(ans[i] + " ");
		bw.flush();
		bw.close();
	}
}