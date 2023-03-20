import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int score = 0;
		int sum = 0;
		double mean = 0;
		double count = 0;
		for(int i=0; i<C; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int[] test = new int[num];
			for(int j=0; j<test.length; j++) {
				score = Integer.parseInt(st.nextToken());
				test[j] = score;
				sum += score;
			}
			mean = sum/num;
			for(int k = 0; k<num; k++) {
				if(test[k]>mean) count += 1;
			}
			double b = count/num*100;
			
			bw.write(String.format("%.3f%%\n",b));
			sum = 0;
			count = 0;
		}
		bw.flush();
		bw.close();
	}
}