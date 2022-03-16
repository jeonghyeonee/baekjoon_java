import java.util.Scanner;

public class Baekjoon_15651 {

    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        arr = new int[M];

        backtracking(N, M, 0);
        System.out.print(sb);

    }

    public static void backtracking(int N, int M, int depth) {

        if (depth == M) {
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= N; i++) {

            arr[depth] = i;
            backtracking(N, M, depth+1);

        }
    }
}