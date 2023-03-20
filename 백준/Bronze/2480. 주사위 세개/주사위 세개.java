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
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int sum = 0;
		int[] max = new int[3];
		max[0] = A;
		max[1] = B;
		max[2] = C;
		int realmax = max[0];
		if(A==B && B==C) {
			sum = 10000 + A*1000;
		}else if(A==B||A==C) {
			sum = 1000 + A*100;
		}else if(B==C){
			sum = 1000 + B*100;
		}else {
			for(int i=1; i<max.length; i++) {
				if(realmax<max[i]) realmax = max[i];
			}
			sum = realmax*100;
			
		}
		bw.write(sum+"");
		bw.flush();
		bw.close();
	}
}