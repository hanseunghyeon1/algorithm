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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int N2 = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		String a;
		for(int i=0; i<N; i++) {
			a = br.readLine();
			map.put(a, i+1);
			map2.put(i+1, a);
		}
		for(int i=0; i<N2; i++) {
			String b = br.readLine();
			if(b.charAt(0)>='A') {
				bw.write(map.get(b)+"\n");
			}else {
				bw.write(map2.get(Integer.parseInt(b))+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}

