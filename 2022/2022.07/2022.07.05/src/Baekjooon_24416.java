import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjooon_24416 {

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new int[N];

        dp[0] = 1;
        dp[1] = 1;

        System.out.println(fibo(N));


    }

    static int fibo(int N){
        for(int i=2; i<N; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[N];
    }


}
