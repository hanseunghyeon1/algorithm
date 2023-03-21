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
		String str;
		char[] arr;
		char[] arr2;
		int[] count = new int[N];
		int sum = 0;
		a:for(int i=0; i<N; i++) {
			str = br.readLine();
			arr = str.toCharArray();
			arr2 = new char[arr.length+1];
			arr2 = Arrays.copyOf(arr, arr.length);
			for(int j=0; j<arr2.length-1; j++) {
				if(arr2[j] != arr2[j+1]) {
					for(int k=j; k<arr2.length-1; k++) {
						if(arr2[j] == arr2[k+1]) {
							count[i] = 0;
							continue a;
						}
					}	
				}
			}
			count[i] = 1;
		}
		for(int i=0; i<N; i++)
			sum += count[i];
		bw.write(sum+"");
		
		bw.flush();
		bw.close();
	}
}