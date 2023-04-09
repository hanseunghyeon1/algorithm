import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		bw.write(fi(n)+"");
		bw.flush();
		bw.close();
	}
	
	public static int fi(int num) {
		if(num<=1)
			return num;
		else
			return fi(num-1)+fi(num-2);
	}
}