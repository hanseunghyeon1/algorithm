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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		String board;
		char[][] arr = new char[M][N];
		for (int i = 0; i < M; i++) {
			board = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = board.charAt(j);
			}
		}

		char[][] startW = new char[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j += 2) {
				if (i % 2 == 0) {
					startW[i][j] = 'W';
					startW[i][j + 1] = 'B';
				} else {
					startW[i][j] = 'B';
					startW[i][j + 1] = 'W';
				}
			}
		}

		char[][] startB = new char[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j += 2) {
				if (i % 2 == 0) {
					startB[i][j] = 'B';
					startB[i][j + 1] = 'W';
				} else {
					startB[i][j] = 'W';
					startB[i][j + 1] = 'B';
				}
			}
		}

		int x = 0;
		int y = 0;
		int min = M * N;
		int count1 = 0;
		int count2 = 0;
		loop: while (true) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (arr[i + x][j + y] != startW[i][j]) {
						count1++;
					}
				}

			}
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (arr[i + x][j + y] != startB[i][j]) {
						count2++;
					}
				}

			}
			if(min>count1) min = count1;
			if(min>count2) min = count2;
			if (x == M - 8 && y == N - 8) {
				break loop;
			}
			if (x < M - 7)
				x++;
			if (x == M - 7) {
				x = 0;
				y++;
			}
			
			count1 = 0;
			count2 = 0;
		}
		bw.write(min + "");
		bw.flush();
		bw.close();
	}
}