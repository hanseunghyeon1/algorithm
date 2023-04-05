import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int N = Integer.parseInt(br.readLine());
		for(int i =0; i<N; i++) {
			map.put(i, Integer.parseInt(br.readLine()));
		}
		HashMap<Integer,Integer> list = new HashMap<>();
		for(int i=1; i<N; i++) {
			list.put(i,map.get(i)-map.get(i-1));
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i=1; i<list.size(); i++) {
			ans.add(uclid(list.get(i), list.get(i+1)));
		}
		int a = ans.stream().min(Comparator.comparing(x->x)).get();
		bw.write((map.get(N-1)-map.get(0))/a+1-N+"");
		bw.flush();
		bw.close();
	}
	public static int uclid(int a, int b) {
		int r;
		while(b!=0) {
			r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}