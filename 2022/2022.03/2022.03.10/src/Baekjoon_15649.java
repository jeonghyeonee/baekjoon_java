//https://st-lab.tistory.com/114
//bactraking 과 dfs 개념!

import java.util.Scanner;

public class Baekjoon_15649 {

    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new int[M];
        visit = new boolean[N];
        backtracking(N, M, 0);

    }

    public static void backtracking(int N, int M, int depth){
        if (depth == M){
            for (int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<N; i++){
            if (!visit[i]){
                visit[i] = true;
                arr[depth] = i+1;
                backtracking(N, M, depth+1);
                visit[i] = false;
            }
        }

    }
}
