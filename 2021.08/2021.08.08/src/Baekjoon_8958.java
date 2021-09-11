import java.util.Scanner;

public class Baekjoon_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            String s = sc.next();
            int cnt = 0;
            int plus = 0;
            for(int j=0; j<s.length(); j++){
                if (s.charAt(j) == 'O'){
                    plus += 1;
                    cnt += plus;
                }
                else{
                    plus = 0;
                }
            }
            System.out.println(cnt);
        }
    }
}
