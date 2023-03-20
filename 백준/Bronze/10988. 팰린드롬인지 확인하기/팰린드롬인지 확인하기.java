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
		String s = br.readLine();
		char[] arr = s.toCharArray();
		int ans = 1;
		for(int i=0; i<arr.length/2; i++)
			if(arr[i] != arr[arr.length-i-1]) ans = 0;
		bw.write(ans+"");
		bw.flush();
		bw.close();
	}
}