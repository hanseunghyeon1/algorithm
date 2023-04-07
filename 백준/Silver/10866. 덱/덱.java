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
		int n = Integer.parseInt(br.readLine());
		LinkedList<Integer> q = new LinkedList<Integer>();
		StringTokenizer st;
		String cmd;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			cmd = st.nextToken();
			if(cmd.equals("push_front")) {
				q.push(Integer.parseInt(st.nextToken()));
			}else if(cmd.equals("push_back")) {
				q.add(Integer.parseInt(st.nextToken()));
			}else if(cmd.equals("pop_front")) {
				if(q.isEmpty()) {
					bw.write("-1\n");
				}else
					bw.write(q.poll()+"\n");
			}else if(cmd.equals("pop_back")) {
				if(q.isEmpty()) {
					bw.write("-1\n");
				}else
					bw.write(q.remove(q.size()-1)+"\n");
			}else if(cmd.equals("size")) {
				bw.write(q.size()+"\n");
			}else if(cmd.equals("empty")) {
				if(q.isEmpty()) {
					bw.write("1\n");
				}else
					bw.write("0\n");
			}else if(cmd.equals("front")) {
				if(q.isEmpty()) {
					bw.write("-1\n");
				}else
					bw.write(q.get(0)+"\n");
			}else if(cmd.equals("back")) {
				if(q.isEmpty()) {
					bw.write("-1\n");
				}else
					bw.write(q.get(q.size()-1)+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}