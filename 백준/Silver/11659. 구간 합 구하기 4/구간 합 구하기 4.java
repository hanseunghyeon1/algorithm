import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		st = new StringTokenizer(br.readLine(), " ");
		map.put(0, Integer.parseInt(st.nextToken()));
		for (int i = 1; i < N; i++) {
			map.put(i,map.get(i-1) + Integer.parseInt(st.nextToken()));
		}
		int j;
		int k;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			j = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			if(j==1) {
				bw.write(map.get(k-1)+"\n");
			}else {
				bw.write(map.get(k-1)-map.get(j-2)+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}