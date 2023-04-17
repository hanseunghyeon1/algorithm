import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String name;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int count = 0;
		for(int i=0; i<N; i++) {
			name = br.readLine();
			if(name.equals("ENTER")) {
				map = new HashMap<String, Integer>();
			}else {
				if(!map.containsKey(name)) {
					map.put(name, 0);
					count++;
				}
			}
		}
		bw.write(count+"");
		bw.flush();
		bw.close();
	}
}
