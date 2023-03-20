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
		int N = Integer.parseInt(st.nextToken());
		for(int i=0; i<N; i++) {
			for(int j=N-i; j>1; j--) {
				bw.write(" ");
			}
			for(int k=0; k<2*i+1; k++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<i+1; j++)
				bw.write(" ");
			for(int k=0; k<N*2-2*(i+1)-1; k++)
				bw.write("*");
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
}