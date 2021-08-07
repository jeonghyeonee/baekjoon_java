import java.util.Scanner;

public class Baekjoon_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = a*b*c;
        String to_result;
        to_result = Integer.toString(result);

        for(int i=0; i < 10; i++){
            int cnt = 0;
            for (int j=0; j < to_result.length(); j++){
                if((to_result.charAt(j))-'0' == i){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
