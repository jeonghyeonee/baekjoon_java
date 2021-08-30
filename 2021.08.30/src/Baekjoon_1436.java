import java.util.Scanner;

public class Baekjoon_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 666;
        int cnt = 0;

        while(true){
            if (Integer.toString(x).contains("666")){
                cnt ++;
            }
            if (cnt == n){
                System.out.println(x);
                break;
            }
            x++;
        }
    }
}
