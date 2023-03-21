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
		StringTokenizer st;
		int a;
		int b;
		while(true) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if(a==0&&b==0) break;
			if(a%b==0||b%a==0) {
				if(a>b)
					bw.write("multiple\n");
				else if(b>a)
					bw.write("factor\n");
				else
					bw.write("neither\n");
			}else
				bw.write("neither\n");
			
		}
		bw.flush();
		bw.close();
	}
}