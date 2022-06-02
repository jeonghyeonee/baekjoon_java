import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;

public class Baekjoon_1912 {

    public static Integer[] dp;
    public static int[] arr;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new Integer[n];
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        max = arr[0];

        check(n-1);

        System.out.println(max);
    }

    public static int check(int n){
        if (dp[n] == null){
            dp[n] = Math.max(check(n-1)+arr[n], arr[n]);

            max = Math.max(dp[n], max);
        }

        return dp[n];

    }

}

// Integer vs. int 차이
// int
// primitive 자료형(ex. long, float, double, ...)
//산술 연산 가능, null로 초기화 불가능

// Integer
// Wrapper 클래스(객체)
// Unboxing(Wrapper -> Primitive)을 하지 않으면 산술 연산 불가능, null 값 처리 가능
// null 값 처리 용이 -> SQL 연동시 처리 용이
// DB에서 자료형이 정수형이지만 null 값이 필요한 경우 VO 에서 Integer 사용 가능