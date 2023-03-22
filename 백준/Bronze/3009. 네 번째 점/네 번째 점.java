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
		int[] xarr = new int[3];
		int[] yarr = new int[3];
		for(int i=0; i<3; i++) {
			st = new StringTokenizer(br.readLine());
			xarr[i] = Integer.parseInt(st.nextToken());
			yarr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(xarr);
		Arrays.sort(yarr);
		if(xarr[0]==xarr[1])
			bw.write(xarr[2]+" ");
		else
			bw.write(xarr[0]+" ");
		if(yarr[0]==yarr[1])
			bw.write(yarr[2]+"");
		else
			bw.write(yarr[0]+"");
		bw.flush();
		bw.close();
	}
}