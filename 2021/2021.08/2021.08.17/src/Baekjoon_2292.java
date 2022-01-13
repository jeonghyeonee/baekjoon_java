import java.util.Scanner;

public class Baekjoon_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1, plus = 6, room = 1;

        if (n==1) System.out.println(1);

        else{
            while (true){
                cnt += plus;
                room += 1;
                if (n<=cnt){
                    System.out.println(room);
                    break;
                }
                plus += 6;
            }
        }
    }
}
