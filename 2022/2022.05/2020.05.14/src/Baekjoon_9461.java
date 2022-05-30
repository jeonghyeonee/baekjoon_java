import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_9461 {

    public static Long[] dp = new Long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;

        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            sb.append(padovan(Integer.parseInt(br.readLine()))).append('\n');
        }

        System.out.println(sb);


    }

    public static long padovan(int N){
        if(dp[N] == null){
            dp[N] = padovan(N-2) + padovan(N-3);
        }
        return dp[N];
    }
}
