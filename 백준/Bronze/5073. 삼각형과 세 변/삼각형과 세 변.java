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
		int[] arr = new int[3];
		while(true) {
			st = new StringTokenizer(br.readLine());
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			if(arr[0]==0&&arr[1]==0&&arr[2]==0)
				break;
			Arrays.sort(arr);
			if(arr[2] < arr[1] + arr[0]) {
				if(arr[0] == arr[1]&& arr[1] == arr[2])
					bw.write("Equilateral\n");
				else if(arr[1]==arr[2]||arr[0]==arr[1]||arr[0]==arr[2])
					bw.write("Isosceles\n");
				else
					bw.write("Scalene\n");
			}else {
				bw.write("Invalid\n");
			}
				
		}
		bw.flush();
		bw.close();
	}
}