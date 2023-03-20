import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] ans = {1,1,2,2,2,8};
		int[] arr = new int[6];
		int arr2 = 0;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(ans[i] != arr[i]) arr2 = ans[i] - arr[i];
			bw.write(arr2+" ");
			arr2=0;
		}
		bw.flush();
		bw.close();
	}
}