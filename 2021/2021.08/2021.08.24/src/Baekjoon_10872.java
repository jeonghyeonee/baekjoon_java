import java.util.Scanner;

public class Baekjoon_10872 {
    static int factorial(int n){
        if (n<=1) return 1;
        else return factorial(n-1)*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(factorial(n));

    }
}
