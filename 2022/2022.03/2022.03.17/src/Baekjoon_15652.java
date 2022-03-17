import java.util.Scanner;

public class Baekjoon_15652 {

    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];

        backtracking(1, 0);
        System.out.println(sb);
    }

    public static void backtracking(int at, int depth){
        if(depth == M){
            for(int i : arr){
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int i=at; i<=N; i++){
            arr[depth] = i;
            backtracking(i, depth+1);

        }
    }
}
