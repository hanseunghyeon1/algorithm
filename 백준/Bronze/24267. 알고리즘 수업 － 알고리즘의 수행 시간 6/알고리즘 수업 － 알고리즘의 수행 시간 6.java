import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long sum = 0;
		long ans = 0;
		for(int i=1; i<=a-2; i++) {
			sum += i;
			ans += sum;
		}
			
		System.out.println(ans);
		System.out.println(3);
		sc.close();
	}
}