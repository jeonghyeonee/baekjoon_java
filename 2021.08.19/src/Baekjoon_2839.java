import java.util.Scanner;

public class Baekjoon_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int s = 0;
        while(n>=0){
            if (n%5 == 0){
                s += n/5;
                System.out.println(s);
                break;
            }
            n -= 3;
            s += 1;
        }

    }
}
