import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a0 = sc.nextInt();
		sc.nextLine();
		int c = sc.nextInt();
		sc.nextLine();
		int n0 = sc.nextInt();
		int ans = 1;

		if ((c>a1&&a1 * n0 + a0 > c * n0)||c<a1)
			ans = 0;
		else if(c<a1)
			ans = 0;

		System.out.println(ans);
		sc.close();
	}
}