import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String a = br.readLine();
		String[] arr = a.split(" ");
		int count = arr.length;
		for(int i=0; i<arr.length; i++)
			if(arr[i].equals("")) count--;
		bw.write(count+"");
		bw.flush();
		bw.close();
	}
}