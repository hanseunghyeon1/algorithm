import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] arr = String.valueOf(N).toCharArray(); 
		Integer[] newarr = new Integer[arr.length];
		for(int i =0; i<arr.length; i++) {
			newarr[i] = arr[i]-'1'+1;
		}
		Arrays.sort(newarr, Comparator.reverseOrder());
		for(int i =0; i<arr.length; i++) {
			System.out.print(newarr[i]);
		}
	}
}