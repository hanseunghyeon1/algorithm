
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
   
       
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        Double A = Double.parseDouble(st.nextToken());
        Double B = Double.parseDouble(st.nextToken());
        bw.write(A / B+"");
        bw.flush();
        bw.close();
	}
}
