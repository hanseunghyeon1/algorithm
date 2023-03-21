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
		String str = br.readLine();
		char[] arr = str.toCharArray(); 
		char[] ans = new char[arr.length+2];
		for(int i=0; i<arr.length; i++) {
			ans[i+1] = arr[i];
		}
		
		int len = arr.length;
		
		for(int i=2; i<ans.length; i++) {
			if(ans[i] == '='||ans[i]=='-') {
				len--;
				if(ans[i-2]== 'd' && ans[i-1]=='z' &&ans[i]=='=')
					len--;
			}else if(ans[i] == 'j') {
				if(ans[i-1]=='l'||ans[i-1] == 'n')
					len--;
			}
		}
		bw.write(len+"");
		bw.flush();
		bw.close();
	}
}