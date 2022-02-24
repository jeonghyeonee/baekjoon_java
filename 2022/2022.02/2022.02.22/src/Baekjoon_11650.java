import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[][] = new int[n][2];

        for(int i=0; i<n; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
//        자바에서 lambda 쓸 수 있나?
        Arrays.sort(arr);
    }
}
