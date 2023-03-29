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
		int sum = 0;

		int N = Integer.parseInt(br.readLine());

		if (N % 5 == 3) {
			sum = N / 5 + 1;
		} else if (N % 5 == 1) {
			sum = N / 5 + 1;
		} else if (N % 5 == 4) {
			sum = N / 5 + 2;
			if (N == 4)
				sum = -1;
		} else if (N % 5 == 2) {
			sum = N / 5 + 2;
			if (N == 7) {
				sum = -1;
			}
		} else if (N % 5 == 0) {
			sum = N / 5;
		}

		bw.write(sum + "");
		bw.flush();
		bw.close();
	}
}