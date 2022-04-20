import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1003 {

    public static int[] zero = new int[41];
    public static int[] one = new int[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        zero[0] = 1;
        zero[1] = 0;
        zero[2] = 1;

        one[0] = 0;
        one[1] = 1;
        one[2] = 1;

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(T-->0){
            int N = Integer.parseInt(br.readLine());
            fibo(N);
            sb.append(zero[N]+ " " + one[N]).append('\n');
        }
        System.out.println(sb);

    }

    public static void fibo(int N){
        if (3 <= N){
            for (int i=3; i<=N; i++){
                zero[N] = zero[N-1] + zero[N-2];
                one[N] = one[N-1] + one[N-2];
            }
        }
        return;
    }
}

// dp array로 다시 풀어보기...
// 2 6 22 > 0 0 / 0 0 
