import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Baekjoon_18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] origin = new int[N];

        for(int i=0; i<N; i++){
            origin[i]=sc.nextInt();
        }

        int[] sorted = origin.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();

        int idx = 0;
        for(int i : sorted){
            if(!map.containsKey(i)){
                map.put(i, idx++);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i : origin){
            int rank = map.get(i);
            sb.append(rank).append(' ');
        }

        System.out.println(sb);

    }
}
