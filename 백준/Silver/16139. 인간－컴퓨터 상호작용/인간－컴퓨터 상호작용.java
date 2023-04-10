import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String S = br.readLine();
		int q = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int count = 0;
		for(int i=0; i<q; i++) {
			st = new StringTokenizer(br.readLine());
			String alpha = st.nextToken();
			int first = Integer.parseInt(st.nextToken());
			int last = Integer.parseInt(st.nextToken());
			String ans = S.substring(first, last+1);
			char[] arr = ans.toCharArray();
			for(int j=0; j<arr.length; j++) {
				if(arr[j]==alpha.charAt(0)) count++;
			}
			bw.write(count+"\n");
			count = 0;
		}
		
		bw.flush();
		bw.close();
	}
}