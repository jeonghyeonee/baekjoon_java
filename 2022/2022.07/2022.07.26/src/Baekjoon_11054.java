import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11054 {

    static Integer[] r_dp;
    static Integer[] l_dp;
    static int[] seq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        r_dp = new Integer[N];
        l_dp = new Integer[N];
        seq = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }
    }
}
