import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<M; i++) {
			a = Integer.parseInt(st.nextToken());
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}else {
				map.put(a, 1);
			}
		}
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			a = Integer.parseInt(st.nextToken());
			if(map.containsKey(a)) {
				bw.write(map.get(a)+" ");
			}else {
				bw.write(0+" ");
			}
		}
		bw.flush();
		bw.close();
	}
}

