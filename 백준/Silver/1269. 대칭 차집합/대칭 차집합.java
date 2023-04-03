import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<A; i++) {
			map.put(Integer.parseInt(st.nextToken()), i);
		}
		int a;
		int count = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<B; i++) {
			a = Integer.parseInt(st.nextToken());
			if(!map.containsKey(a)) {
				count++;
			}else {
				map.remove(a);
			}
		}
		for(int i : map.keySet())
			count++;
		bw.write(count+"");
		bw.flush();
		bw.close();
	}
}

