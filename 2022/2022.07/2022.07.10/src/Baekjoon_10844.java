import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10844 {

    static Long[][] dp;
    static int N;
    final static long MOD = 1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        dp = new Long[N+1][10];

        for(int i=0; i<10; i++){
            dp[1][i] = 1L;
        }

//        호오,,,문제가 생각보다 이해가 안 가는 걸?
    }
}
