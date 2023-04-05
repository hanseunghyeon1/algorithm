import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<Integer>();
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i<N; i++) {
			String s = br.readLine();
			if(s.equals("top")) {
				if(stack.size()==0) {
					bw.write(-1+"\n");
					continue;
				}
				bw.write(stack.get(stack.size()-1)+"\n");
			}else if(s.equals("size")) {
				bw.write(stack.size()+"\n");
			}else if(s.equals("pop")) {
				if(stack.size()==0) {
					bw.write(-1+"\n");
					continue;
				}
				bw.write(stack.pop()+"\n");
			}else if(s.equals("empty")) {
				if(stack.isEmpty()) {
					bw.write(1+"\n");
				}else {
					bw.write(0+"\n");
				}
			}else {
				StringTokenizer st = new StringTokenizer(s);
				String a = st.nextToken();
				int b = Integer.parseInt(st.nextToken());
				stack.push(b);
			}
		}
		bw.flush();
		bw.close();
	}
}