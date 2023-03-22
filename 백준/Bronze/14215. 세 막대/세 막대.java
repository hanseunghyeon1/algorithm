import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int[] arr = new int[3];

		st = new StringTokenizer(br.readLine());
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		arr[2] = Integer.parseInt(st.nextToken());

		Arrays.sort(arr);
		if (arr[0] + arr[1] > arr[2])
			bw.write(arr[0] + arr[1] + arr[2]+"");
		else
			bw.write((arr[0] + arr[1]) * 2 - 1 + "");
		bw.flush();
		bw.close();
	}
}