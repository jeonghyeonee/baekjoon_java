import java.util.Scanner;

public class Baekjoon_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a = sc.next();
        int s = 0;

        for (int i=0; i<n; i++){
            s += a.charAt(i)-'0';
        }

        System.out.println(s);
    }
}
