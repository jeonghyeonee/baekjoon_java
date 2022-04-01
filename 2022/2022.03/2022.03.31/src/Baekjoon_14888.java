import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_14888 {

    public static int N;
    public static int[] num;
    public static int[] operator = new int[4];
    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        num = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 숫자 입력
        for (int i = 0; i<N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        // 연산자 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<4; i++){
            operator[i] = Integer.parseInt(st.nextToken());
        }

        calculator(num[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);

    }

    public static void calculator(int n, int idx){
        if (idx == N){
            MAX = Math.max(MAX, n);
            MIN = Math.min(MIN, n);
            return;
        }

        for(int i=0; i<4; i++){
            if(operator[i] > 0){
                operator[i]--;

                switch (i){
                    case 0:
                        calculator(n+num[idx], idx+1);
                        break;
                    case 1:
                        calculator(n-num[idx], idx+1);
                        break;
                    case 2:
                        calculator(n*num[idx], idx+1);
                        break;
                    case 3:
                        calculator(n/num[idx], idx+1);
                        break;
                }

                operator[i]++;
            }
        }

    }
}
