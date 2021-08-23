import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int[] len = new int[3];
            for(int i=0; i<3; i++){
                len[i] = sc.nextInt();
            }

            if (len[0]==0 && len[1]==0 && len[2]==0) break;

            Arrays.sort(len);

            if (Math.pow(len[2], 2) == Math.pow(len[0], 2)+Math.pow(len[1], 2)){
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }


        }
    }
}
