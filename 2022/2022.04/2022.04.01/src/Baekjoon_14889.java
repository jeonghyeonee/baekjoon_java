import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_14889 {

    public static int N;
    public static int[][] score;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        score = new int[N][N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                score[i][j] = Integer.parseInt(st.nextToken());
            }
        }

    }

    public static void plus(int n, int ability){

    }
}
