import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int x = 1;
		int y = 1;
		int cnt = 1;
		boolean b = true;
		while(true) {
			if(num==cnt)
				break;
			if(b) {
				x++;
				cnt++;
				if(cnt==num)
					break;
				while(true) {
					if(x==1) {
						b = false;
						break;
					}
					x--;
					y++;
					cnt++;
					if(cnt==num)
						break;
				}
				
			}else {
				y++;
				cnt++;
				if(cnt==num)
					break;
				while(true) {
					if(y==1) {
						b = true;
						break;
					}
					x++;
					y--;
					cnt++;
					if(cnt==num)
						break;
				}
				
			}
		}
		bw.write(y+"/"+x);
		bw.flush();
		bw.close();
	}
}