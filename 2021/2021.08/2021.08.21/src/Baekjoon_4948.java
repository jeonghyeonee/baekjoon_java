import java.util.Scanner;

public class Baekjoon_4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();

            if (n==0) break;
            int cnt = 0;
            int sw = 0;

            for(int i=n+1; i<=2*n; i++){
                int root = (int)Math.sqrt(i)+1;
                for(int j=2; j<root; j++){
                    if(i%j==0){
                        sw = 1;
                        break;
                    }
                }
                if(sw==0) cnt++;
                sw = 0;
            }
            System.out.println(cnt);
        }
    }
}
