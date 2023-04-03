import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String S = br.readLine();
		int count = 0;
		int[] arr = new int[S.length()+1];
		for(int i=S.length(); i>0; i--) {
			arr[S.length()-i+1] = arr[S.length()-i]+i;
			count += i;
		}
		String[] ans = new String[count];
		for(int i=0; i<S.length(); i++) {
			for(int j=i; j<S.length(); j++) {
				if(i == 0) {
					ans[j] = String.valueOf(S.charAt(j));
				}else {
					ans[arr[i]+j-i] = ans[arr[i-1]+j-i] + String.valueOf(S.charAt(j));
				}
			}
		}
		HashSet<String> set = new HashSet<String>();
		for(String i : ans) {
			set.add(i);
		}
		count = 0;
		for(String i: set) {
			count++;
		}
		bw.write(count+" ");
		bw.flush();
		bw.close();
	}
}

