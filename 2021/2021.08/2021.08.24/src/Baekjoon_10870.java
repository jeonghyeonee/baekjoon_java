import java.util.Scanner;

public class Baekjoon_10870 {
    static int fibo(int n){
        if (n==0 || n==1) return n;
        else return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
