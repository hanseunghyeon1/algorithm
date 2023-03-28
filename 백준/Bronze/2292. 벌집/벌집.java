import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int room = 1;
		int count = 1;
		while(true) {
			room = room+6*count;
			count++;
			if(room>=num)
				break;
		}
		if(num==1)
			bw.write(1+"");
		else
			bw.write(count+"");
		bw.flush();
		bw.close();
	}
}