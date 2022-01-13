import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_10989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] Array = new int[n];

        for (int i=0; i<n; i++){
            Array[i] = sc.nextInt();
        }

        Arrays.sort(Array);

        for (int i : Array){
            System.out.println(i);
        }
    }
}
