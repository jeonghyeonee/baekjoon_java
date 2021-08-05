import java.util.Scanner;

public class Baekjoon_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =0;
        int a=n;

        while (true){
            int a1 = n/10;
            int a2 = n%10;
            int a3 = a1 + a2;
            n = a2*10 + a3 % 10;
            cnt += 1;
            if (a == n){
                break;
            }
        }
        System.out.println(cnt);
    }
}
