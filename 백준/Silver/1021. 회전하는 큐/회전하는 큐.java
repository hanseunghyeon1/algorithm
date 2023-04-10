import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Integer> list = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for(int i = 1; i<=N; i++) {
			list.add(i);
		}
		int[] arr = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int half;
		int cnt = 0;
		for(int i =0; i<M; i++) {
			if(list.size()%2==0) {
				half = list.size()/2-1;
			}else
				half = list.size()/2;
			
			int index = list.indexOf(arr[i]);
			
			if(index <= half) {
				for(int j=0; j<index; j++) {
					list.add(list.poll());
					cnt++;
				}
			}else {
				for(int j=0; j<list.size()-index; j++) {
					list.push(list.pollLast());
					cnt++;
				}
			}
			list.remove(0);
		}
		bw.write(cnt+"");
		bw.flush();
		bw.close();
	}
}
