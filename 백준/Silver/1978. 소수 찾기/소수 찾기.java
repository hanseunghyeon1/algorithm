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
		int N = Integer.parseInt(br.readLine());
		int num;
		int count = 0;
		int sosu;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			sosu = 0;
			num = Integer.parseInt(st.nextToken());
			for(int j=1; j<num+1; j++) {
				if(num%j==0)
					sosu++;
			}
			if(sosu==2)
				count++;
		}
		bw.write(count+"");
		bw.flush();
		bw.close();
	}
}