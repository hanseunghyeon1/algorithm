import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine().toUpperCase();
		int[] ans = new int[26];
		int max = 0;
		char maxch = 'A';
		for(int i=0; i<s.length(); i++)
			ans[s.charAt(i)-'A'] += 1;
		for(int i=0; i<ans.length; i++) {
			if(max<ans[i]) {
				max = ans[i];
				maxch = (char)('A'+i);
			}else if(max==ans[i]) {
				maxch='?';
			}
		}
		bw.write(maxch);
		bw.flush();
		bw.close();
	}
}