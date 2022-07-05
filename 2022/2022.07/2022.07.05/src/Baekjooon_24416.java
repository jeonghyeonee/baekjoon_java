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


    }

    public int fibo(int N){
        return dp[N];
    }


}
