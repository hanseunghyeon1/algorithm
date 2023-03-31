import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collector;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		com[] arr = new com[N + 1];
		arr[0] = new com("");
		for (int i = 0; i < N; i++) {
			arr[i+1] = new com(br.readLine());
		}
		Arrays.sort(arr);
		for (int i = 1; i < N+1; i++) {
			if(arr[i].a.equals("")) continue;
			if (!arr[i-1].a.equals(arr[i].a))
				bw.write(arr[i].a + "\n");
		}
		bw.flush();
		bw.close();
	}
}

class com implements Comparable<com> {
	String a;

	public com(String a) {
		this.a = a;
	}

	public int compareTo(com o) {
		int i = 0;
		if (this.a.length() == o.a.length()) {
			while (true) {
				if (this.a.charAt(i) != o.a.charAt(i)) {
					return this.a.charAt(i) - o.a.charAt(i);
				}
				if (this.a.equals(o.a)) {
					return 0;
				}
				i++;
			}
		}
		return this.a.length() - o.a.length();
	}
}
