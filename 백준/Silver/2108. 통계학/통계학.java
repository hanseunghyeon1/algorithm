import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        //평균
        Double streamAvg = list.stream().mapToInt(i -> i).average().getAsDouble();
        String[] split = String.valueOf(streamAvg).split("\\.");
        int avg = Integer.parseInt(split[0]);
        if(split.length > 1) {
            if(Integer.parseInt(String.valueOf(split[1].charAt(0))) >= 5){
                if(avg >= 0)
                    avg += 1;
                else
                    avg -= 1;
            }
        }
        bw.write(avg+"\n");

        //중앙값
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        Integer mid = sortedList.get(num/2);
        bw.write(mid+"\n");

        //최빈값
        HashMap<Integer, Integer> map = new HashMap<>();
        sortedList.stream().forEach(i -> {
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i, 0);
        });
        Integer highCount = map.values().stream().sorted().collect(Collectors.toList())
            .get(map.size() - 1);
        List<Integer> collect = map.keySet().stream().filter(key -> map.get(key) == highCount).sorted()
            .collect(Collectors.toList());
        Integer highKey = collect.size() == 1 ? collect.get(0) : collect.get(1);
        bw.write(highKey+"\n");

        //범위
        int range = 0;
        if(sortedList.size() > 1)
            range += sortedList.get(sortedList.size()-1)-sortedList.get(0);
        bw.write(range+"");

        bw.flush();
        bw.close();
        br.close();
    }

}
