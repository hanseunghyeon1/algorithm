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
		int N = Integer.parseInt(br.readLine());
		String cheak = "가";
		for (int i = 0; i < N; i++) {
			Stack<Integer> stack = new Stack<Integer>();
			char[] arr = br.readLine().toCharArray();
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == '(') {
					stack.push(j);
				} else {
					if (stack.isEmpty()) {
						cheak = "NO";
						break;
					}
					stack.pop();
				}
			}
			if (cheak.equals("가")) {
				if (stack.isEmpty()) {
					cheak = "YES";
				} else {
					cheak = "NO";
				}
			}
			bw.write(cheak + "\n");
			cheak="가";
		}
		bw.flush();
		bw.close();
	}
}