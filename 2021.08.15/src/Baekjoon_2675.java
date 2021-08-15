import java.util.Scanner;

public class Baekjoon_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            int r = sc.nextInt();
            char[] s = sc.next().toCharArray();
            for(int j=0; j<s.length; j++){
                for(int k=0; k<r; k++){
                    System.out.print(s[j]);
                }
            }
            System.out.println();   // 이 줄 없으면 틀림!
        }

    }
}
