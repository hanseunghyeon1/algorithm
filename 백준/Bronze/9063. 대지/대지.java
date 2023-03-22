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
		int N = Integer.parseInt(br.readLine());
		int[] xarr = new int[N];
		int[] yarr = new int[N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			xarr[i] = Integer.parseInt(st.nextToken());
			yarr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(xarr);
		Arrays.sort(yarr);
		bw.write((xarr[xarr.length-1]-xarr[0])*(yarr[yarr.length-1]-yarr[0]) + "");
		
		bw.flush();
		bw.close();
	}
}