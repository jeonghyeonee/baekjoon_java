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

    static int LTS(int N){
        if(r_dp[N] == null){
            r_dp[N] = 1;

            for(int i=N-1; i>=0; i--){
                if(seq[i] <seq[N]){
                    r_dp[N] = Math.max(r_dp[N], LTS(i)+1);
                }
            }
        }
        return r_dp[N];
    }

    static int LDS(int N){
        if(l_dp[N] == null){
            l_dp[N] = 1;
        }
    }


}
