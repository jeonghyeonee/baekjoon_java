import java.util.Scanner;

public class Baekjoon_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n==1) System.out.println();

        for (int i=2; i<=n; i++){
            while(true){
                if (n%i==0){
                    System.out.println(i);
                    n /= i;
                }
                else break;
            }
        }
    }
}
