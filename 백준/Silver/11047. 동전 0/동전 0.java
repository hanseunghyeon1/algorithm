import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		LinkedList<Integer> stack = new LinkedList<Integer>();
		for(int i=0; i<N; i++) {
			stack.push(Integer.parseInt(br.readLine()));
		}
		int cnt = 0;
		for(int i : stack) {
			cnt += K/i;
			K %= i;
		}
		bw.write(cnt+"");
		bw.flush();
		bw.close();
	}

}
