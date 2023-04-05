import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = Integer.parseInt(br.readLine());
		for(long i = 0; i<n; i++) {
			long a = Long.parseLong(br.readLine());
			BigInteger s = BigInteger.valueOf(a);
			if(s.isProbablePrime(10)) {
				bw.write(s+"\n");
			}else {
				bw.write(s.nextProbablePrime()+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}