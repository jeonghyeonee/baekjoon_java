import java.util.Scanner;

public class Baekjoon_15596 {
    static long sum(int[] a){
        long s = 0;
        for(int i : a){
            s += i;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println(sum(a));
    }
}
