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
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String name1;
		String name2;
		int count = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			name1 = st.nextToken();
			name2 = st.nextToken();
			if((name1.equals("ChongChong")||name2.equals("ChongChong"))&&!map.containsKey("ChongChong")) {
				map.put("ChongChong", 1);
				count++;
			}
			if(map.containsKey(name1)&&map.containsKey(name2)) {
				continue;
			}else if(map.containsKey(name1)) {
				map.put(name2, 1);
				count++;
			}else if(map.containsKey(name2)) {
				map.put(name1, 1);
				count++;
			}
		}
		bw.write(count+"");
		bw.flush();
		bw.close();
	}
}
