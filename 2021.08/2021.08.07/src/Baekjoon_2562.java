import java.util.Scanner;

public class Baekjoon_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int idx = 0;

        for(int j = 0; j < arr.length; j++){
            if (arr[j]>max){
                max = arr[j];
                idx = j;
            }
        }
        System.out.println(max);
        System.out.println(idx+1);
    }
}
