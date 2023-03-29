import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int start = 666;
		int count = 0;
		while(true) {
			if(String.valueOf(start).contains("666")) {
				count++;
				if(N==count)
					break;
				start++;
			}else {
				start++;
			}
		}
		bw.write(start+"");
		bw.flush();
		bw.close();
	}
}