import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		if(a==b&&b==c&&c==60) {
			bw.write("Equilateral\n");
		}else if(a+b+c==180&&(a==b||b==c||a==c)) {
			bw.write("Isosceles\n");
		}else if(a+b+c==180&&(a!=b||b!=c||a!=c)) {
			bw.write("Scalene\n");
		}else {
			bw.write("Error\n");
		}
		bw.flush();
		bw.close();
	}
}