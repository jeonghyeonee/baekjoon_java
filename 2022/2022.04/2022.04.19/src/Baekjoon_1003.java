import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1003 {

    public static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(T --> 0){
            int N = Integer.parseInt(br.readLine());
            fibo(N);
            sb.append(dp[N][0]+ " " + dp[N][1]).append('\n');
        }
        System.out.println(sb);

    }

    public static Integer[] fibo(int N){
        if (dp[N][0] == null || dp[N][1] == null){
            dp[N][0] = fibo(N-1)[0] + fibo(N-2)[0];
            dp[N][1] = fibo(N-1)[1] + fibo(N-2)[1];
        }
        return dp[N];
    }
}

// dp array로 다시 풀어보기...
// 2 6 22 > 0 0 / 0 0
