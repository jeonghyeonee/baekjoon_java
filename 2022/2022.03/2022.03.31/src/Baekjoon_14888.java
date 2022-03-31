import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_14888 {

    public static int N;
    public static int[] num;
    public static int[] operator = new int[4];

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
        for (int i=0; i<4; i++){
            operator[i] = Integer.parseInt(st.nextToken());
        }

    }
    
    public static void calculator{

    }
}
