import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<N; i++){
			map.put(br.readLine(), i);
		}
		String a;
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<M; i++) {
			a = br.readLine();
			if(map.containsKey(a)) {
				list.add(a);
			}
		}
		System.out.println(list.stream().count());
		list.stream().sorted().forEach(System.out::println);
	}
}

