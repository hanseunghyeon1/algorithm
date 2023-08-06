import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Stack stack = new Stack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int number = Integer.parseInt(br.readLine());
        for (int i = 0; i < number; i++) {
            st = new StringTokenizer(br.readLine());
            Integer order = Integer.parseInt(st.nextToken());
            if (order == 1) {
                one(stack, Integer.parseInt(st.nextToken()));
            } else if (order == 2) {
                bw.write(two(stack)+"");
                enter(bw, i, number);
            } else if (order == 3) {
                bw.write(three(stack)+"");
                enter(bw, i, number);
            } else if (order == 4) {
                bw.write(four(stack)+"");
                enter(bw, i, number);
            } else if(order == 5){
                bw.write(five(stack)+"");
                enter(bw, i, number);
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static void one(Stack stack, int x) {
        stack.push(x);
    }

    private static int two(Stack stack) {
        if (stack.empty()) {
            return -1;
        } else {
            return (int) stack.pop();
        }
    }

    private static int three(Stack stack) {
        return stack.size();
    }

    private static int four(Stack stack) {
        if (stack.empty()) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int five(Stack stack) {
        if (stack.empty()) {
            return -1;
        } else {
            return (int) stack.peek();
        }
    }

    private static void enter(BufferedWriter bufferedWriter, int i, int num) throws IOException {
        if(i < num-1)
            bufferedWriter.write("\n");
    }
}
