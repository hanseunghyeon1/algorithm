import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long sum = 0;
		for(int i=1; i<a; i++)
			sum += i;
		System.out.println(sum);
		System.out.println(2);
		sc.close();
	}
}