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
		String A = st.nextToken();
		long B = Long.parseLong(st.nextToken());
		char[] arr = A.toCharArray();
		long sum = 0;
		for(int i=0; i<A.length(); i++) {
			if('A'<=arr[A.length()-i-1]&&'Z'>=arr[A.length()-i-1])
				sum += (arr[A.length()-i-1]-'A'+10)*Math.pow(B,i);
			else {
				sum += (arr[A.length()-i-1]-'0')*Math.pow(B,i);
			}
		}
		bw.write(sum+"");
		bw.flush();
		bw.close();
	}
}
