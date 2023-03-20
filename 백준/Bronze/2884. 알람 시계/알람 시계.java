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
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		if(hour==0) {
			if(min<45) {
				hour = 23;
				min += 15;
			}else {
				hour = 0;
				min -= 45;
			}
		}else {
			if(min<45) {
				hour = hour-1;
				min += 15;
			}else {
				min -= 45;
			}
		}
		bw.write(hour+" "+min);
		bw.flush();
		bw.close();
	}
}