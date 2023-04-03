import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String k;
		String v;
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			k = st.nextToken();
			v = st.nextToken();
			map.put(k,v);
		}
		ArrayList<String> list = new ArrayList<String>();
		for(Map.Entry<String, String> i : map.entrySet()) {
			if(i.getValue().equals("enter"))
				list.add(i.getKey());
		}
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}