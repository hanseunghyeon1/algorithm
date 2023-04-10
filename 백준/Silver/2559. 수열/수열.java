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
		st = new StringTokenizer(br.readLine());
		map.put(0, Integer.parseInt(st.nextToken()));
		for(int i=1; i<N; i++) {
			map.put(i, map.get(i-1)+Integer.parseInt(st.nextToken()));
		}
		int max = map.get(M-1);
		int j = 0;
		for(int i=M; i<N; i++) {
			if(max<map.get(i)-map.get(j)) max = map.get(i)-map.get(j);
			j++;
		}
		bw.write(max+"");
		bw.flush();
		bw.close();
	}
}