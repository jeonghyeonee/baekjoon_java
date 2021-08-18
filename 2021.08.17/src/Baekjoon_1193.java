import java.util.Scanner;

public class Baekjoon_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 1, a = 0, b = 0;

        while (n>cnt){
            n -= cnt;
            cnt += 1;
        }

        if (cnt%2==0){
            a = n;
            b = cnt-n+1;
        }
        else{
            a = cnt-n+1;
            b = n;
        }
        System.out.printf("%d/%d", a, b);
    }
}
