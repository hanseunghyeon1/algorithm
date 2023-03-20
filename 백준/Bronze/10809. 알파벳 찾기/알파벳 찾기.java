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
		String s = st.nextToken();
		char[] a = s.toCharArray();
		int[] ans = new int[26];
		for(int i=0; i<ans.length; i++)
			ans[i] = -1;
		for(int i=0; i<a.length; i++) {
			if(ans[a[i]-(int)('a')] == -1)
				ans[a[i]-(int)('a')] = i;
		}
		for(int i=0; i<ans.length; i++)
			bw.write(ans[i]+" ");
		bw.flush();
		bw.close();
	}
}