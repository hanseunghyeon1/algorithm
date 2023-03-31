import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collector;

import javax.print.attribute.standard.Sides;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int age = 0;
		String name = "";
		com[] arr = new com[N];
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			age = Integer.parseInt(st.nextToken());
			name = st.nextToken();
			arr[i] = new com(age,name);
		}
		Arrays.sort(arr);
		for(com i : arr)
			bw.write(i.a+" "+i.b+"\n");
		bw.flush();
		bw.close();
	}
}

class com implements Comparable<com> {
	int a;
	String b;
	
	public com(int a, String b) {
		this.a = a;
		this.b = b;
	}

	public int compareTo(com o) {
		return this.a-o.a;
	}
}
