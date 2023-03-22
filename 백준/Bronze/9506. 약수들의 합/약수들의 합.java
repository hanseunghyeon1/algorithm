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
		int num;
		int sum;
		int[] arr;
		while(true) {
			 int n = Integer.parseInt(br.readLine());
			 if(n==-1)
				 break;
			 num = 0;
			 sum = 0;
			 arr = new int[n];
			 for(int i=1; i<n; i++) {
				 if(n%i==0) {
					 arr[num] = i;
					 sum += i;
					 num++;
				 }
			 }
			 if(sum == n) {
				 bw.write(sum + " = ");
				 for(int j=0; j<num; j++) {
					 bw.write(arr[j]+"");
					 if(j != num-1)
						 bw.write(" + ");
				 }
				 bw.write("\n");
			 }else {
				 bw.write(n + " is NOT perfect.\n");
			 }
			 
		}
		bw.flush();
		bw.close();
	}
}