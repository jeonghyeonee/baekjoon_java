import java.util.Scanner;

public class Baekjoon_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int m = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++)
            if (arr[i] > arr[j]){
                m = arr[i];
                arr[i] = arr[j];
                arr[j] = m;
            }
        }

        for(int i: arr){
            System.out.println(i);
        }
    }
}
