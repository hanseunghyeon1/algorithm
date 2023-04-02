import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[] numStr = br.readLine().split(" ");
		int[] num = new int[N];

		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(numStr[i]);
		}

		Arrays.sort(num);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int m = 0;
		for (int i = 0; i < N; i++) {
			if (map.containsKey(num[i])) {
				continue;
			}else{
				map.put(num[i], m);
				m++;
			}
		}

		for (int i = 0; i < N; i++) {
			int key = Integer.parseInt(numStr[i]);
			bw.write(map.get(key)+" ");
		}
		bw.flush();
		bw.close();
	}
}