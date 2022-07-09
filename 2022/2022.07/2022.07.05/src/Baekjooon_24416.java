import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjooon_24416 {

    static int[] dp;
    static int cnt1 = 0;
    static int cnt2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new int[N+1];

        dp[1] = 1;
        dp[2] = 1;

        System.out.println(fib(N) + " " + fibo(N));


    }

    static int fibo(int N){
        for(int i=3; i<(N+1); i++){
            dp[i] = dp[i-1] + dp[i-2];
            cnt2++;
        }
        return cnt2;
    }

    static int fib(int N){
        cnt1++;
        if (N==1 || N==2){
            return 1;
        }
        else{
            return (fib(N-1) + fib(N-2));
        }
    }


}
