// Hashmap을 사용할 경우 같은 나이의 사람들을 못 저장 -> 2차원 배열 사용
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Baekjoon_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[][] arr = new String[N][2];

        for (int i=0; i<N; i++){
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
            }
        });

        for(int i=0; i<N; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}
