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
		char[] a;
		b: while (true) {
			Stack<Character> stack = new Stack<Character>();
			a = br.readLine().toCharArray();
			if (a[0] == '.')
				break;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == '(' || a[i] == '[')
					stack.push(a[i]);
				else if (a[i] == ')') {

					if (stack.empty() || stack.peek() == '[') {
						bw.write("no\n");
						continue b;
					} else {
						stack.pop();
					}
				} else if (a[i] == ']') {
					if (stack.empty() || stack.peek() == '(') {
						bw.write("no\n");
						continue b;
					} else {
						stack.pop();
					}
				}
			}
			if (stack.isEmpty())
				bw.write("yes\n");
			else {
				bw.write("no\n");
			}
		}
		bw.flush();
		bw.close();
	}
}