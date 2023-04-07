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
		LinkedList<Integer> list = new LinkedList<Integer>();
		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		bw.write("<");
		while (true) {
			for (int i = 0; i < K; i++) {
				cnt++;
				if (cnt > list.size()) {
					cnt = 1;
				}
			}
			if(list.size()>1) {
				bw.write(list.get(cnt-1)+", ");
			}else if(list.size()==1) {
				bw.write(list.get(cnt-1)+">");
			}
			list.remove(cnt - 1);
			cnt--;
			if (list.isEmpty())
				break;
		}
		bw.flush();
		bw.close();
	}
}