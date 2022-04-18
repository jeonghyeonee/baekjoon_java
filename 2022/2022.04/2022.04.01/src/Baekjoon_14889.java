import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_14889 {

    public static int N;
    public static int[][] score;
    public static boolean[] check;

    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        score = new int[N][N];
        check = new boolean[N];


        for (int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<N; j++){
                score[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        plus(0, 0);
        System.out.println(min);

    }

    public static void plus(int idx, int cnt){
        if(cnt == N/2){
            differ();
            return;
        }

        for(int i=idx; i<N; i++){
            if(!check[i]){
                check[i] = true;
                plus(i+1, cnt+1);
                check[i] = false;
            }
        }
    }

    public static void differ(){
        int start = 0;
        int link = 0;

        for (int i=0; i<N-1; i++){
            for (int j=i+1; j<N; j++){
                if (check[i] == true && check[j] == true){
                    start += score[i][j];
                    start += score[j][i];
                }

                else if (check[i] == false && check[j] == false){
                    link += score[i][j];
                    link += score[j][i];
                }
            }
        }

        int val = Math.abs(start - link);

        if (val == 0){
            System.out.println(val);
            System.exit(0);
        }

        min = Math.min(val, min);
    }
}
