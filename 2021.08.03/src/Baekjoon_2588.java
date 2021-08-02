import java.util.Scanner;

public class Baekjoon_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n = n2;

        int n3 = n1*(n % 10);
        n = n/10;
        int n4 = n1*(n%10);
        int n5 = n1*(n/10);

        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n1*n2);

    }
}
