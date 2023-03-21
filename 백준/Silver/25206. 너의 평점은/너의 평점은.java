import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String subject;
		double hour;
		String grade;
		double realgrade;
		double gop = 0;
		double totalhour = 0;
		double total = 0;
		for(int i=0; i<20; i++) {
			realgrade = 0;
			st = new StringTokenizer(br.readLine());
			subject = st.nextToken();
			hour = Double.parseDouble(st.nextToken());
			grade = st.nextToken();
			if(grade.charAt(0) == 'P') 
				continue; 
			realgrade = 'E' - grade.charAt(0);
			if(grade.charAt(0)=='F')
				realgrade = 0;
			if(grade.charAt(0)!='F'&&grade.charAt(1) == '+') 
				realgrade += 0.5;
			gop += realgrade * hour;
			totalhour += hour;
		}
		total = gop/totalhour;
		
		bw.write(total+"");
		bw.flush();
		bw.close();
	}
}