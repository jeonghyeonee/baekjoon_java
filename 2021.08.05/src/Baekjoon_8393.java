import java.util.Scanner;

public class Baekjoon_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i=1; i <= n; i++){
            s += i;
        }
        System.out.println(s);
    }
}
