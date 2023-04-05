import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<Integer>();
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i<N; i++) {
			int k = Integer.parseInt(br.readLine());
			if(k==0) {
				stack.pop();
			}else {
				stack.push(k);
			}
		}
		int sum = 0;
		for(int i:stack)
			sum += i;
		bw.write(sum+"");
		bw.flush();
		bw.close();
	}
}