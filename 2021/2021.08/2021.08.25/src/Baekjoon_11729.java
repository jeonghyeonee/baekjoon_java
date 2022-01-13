import java.util.Scanner;

public class Baekjoon_11729 {
    static void hanoi(int n, int from_p, int to_p, int aux_p){
        if (n==1){
            System.out.println(from_p+" "+to_p);
            return;
        }
        hanoi(n-1, from_p, aux_p, to_p);
        System.out.println(from_p+" "+to_p);
        hanoi(n-1, aux_p, to_p, from_p);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int)Math.pow(2, n)-1);
        hanoi(n, 1, 3, 2);
    }
}
