import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<N; i++) {
			map.put(Integer.parseInt(st.nextToken()), 0);
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int a = 0;
		int[] arr = new int[M];
		for(int i=0; i<M; i++) {
			a = Integer.parseInt(st.nextToken());
			arr[i] = a;
			if(map.containsKey(a)) {
				map.replace(a, 1);
			}else {
				map.put(a,0);
			}
		}
		for(int i = 0; i<M; i++) {
			bw.write(map.get(arr[i])+" ");
		}
		bw.flush();
		bw.close();
	}
}