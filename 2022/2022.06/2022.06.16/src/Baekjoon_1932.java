import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1932 {

    public static Integer[][] dp;
    public static int[][] arr;
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        dp = new Integer[N][N];
        StringTokenizer st;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");

            for(int j=0; j<i+1; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(find(0, 0));

    }

    public static int find(int depth, int idx){
        if(depth == N-1){
            return dp[depth][idx];
        }

        if(dp[depth][idx] == null){
            dp[depth][idx] = Math.max(find(depth+1, idx), find(depth+1, idx+1)) + arr[depth][idx];
        }
        return dp[depth][idx];
    }
}
