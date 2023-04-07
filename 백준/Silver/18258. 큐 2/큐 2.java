import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		String cmd = null;
		StringTokenizer st;
		int a = 0;
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			cmd = st.nextToken();
			if(cmd.equals("push")) {
				a = Integer.parseInt(st.nextToken());
				q.add(a);
			}else if(cmd.equals("pop")) {
				if(q.isEmpty()) {
					bw.write(-1+"\n");
				}else {
					bw.write(q.poll()+"\n");
				}
			}else if(cmd.equals("size")) {
				bw.write(q.size()+"\n");
			}else if(cmd.equals("empty")) {
				if(q.isEmpty())
					bw.write(1+"\n");
				else
					bw.write("0\n");
			}else if(cmd.equals("front")) {
				if(q.isEmpty()) {
					bw.write("-1\n");
				}else
					bw.write(q.peek()+"\n");
			}else if(cmd.equals("back")) {
				if(q.isEmpty()) {
					bw.write("-1\n");
				}else
					bw.write(a+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}