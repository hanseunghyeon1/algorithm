import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sosu;
		int sum = 0;
		int[] min = new int[N-M+1];
		int num = 0;
		for(int i=M; i<=N; i++) {
			sosu = 0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					sosu++;
				}
			}
			if(sosu==2) {
				sum += i;
				min[num] = i;
				num++;
			}
		}
		if(num == 0) {
			bw.write(-1+"");
		}else {
			bw.write(sum +"\n"+ min[0]);
		}
		bw.flush();
		bw.close();
	}
}