import java.util.Scanner;

public class Baekjoon_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;      // 전체 소수를 알기 위한 변수
        for(int i:arr){
            int cnt = 0;
            for(int j=1; j<=i; j++){
                if (i%j == 0){
                    cnt += 1;
                    if (cnt > 2){
                        break;
                    }
                }
            }
            if (cnt == 2){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
