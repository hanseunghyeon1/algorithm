import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		int x = 0;
		int y = 0;
		if(a == 0) {
			y = c/b;
			x = (f-e*y)/d;
		}else if(b == 0) {
			x = c/a;
			y = (f-d*x)/e;
		}else {
			if(d==0) {
				y = f/e;
				x = (c-b*y)/a;
			}else if(e == 0) {
				x = f/d;
				y = (c-a*x)/b;
			}else {
				 y = (c*d-f*a)/(d*b-e*a);
				 x = (c-b*y)/a;
			}
		}
		bw.write(x+" "+y);
		bw.flush();
		bw.close();
	}
}