import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		com[] arr = new com[N];
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = new com(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(arr);
		for(com j : arr)
			bw.write(j.x+" "+j.y+"\n");
		bw.flush();
		bw.close();
	}
}

class com implements Comparable<com> {
	int x;
	int y;
	
	public com() {
		
	}
	
	public com(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int compareTo(com o) {
		if (this.x - o.x == 0) {
			return this.y - o.y;
		}
		return this.x - o.x;
	}
}
