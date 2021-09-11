import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=n; i<=m; i++){
            arr.add(i);
        }

        for(int i:arr){
            int cnt = 0;
            for(int j=1; j<=i; j++){
                if (i%j == 0){
                    cnt += 1;
                    if (cnt > 2){
                        break;
                    }
                }
            }
            if (cnt == 2){
                list.add(i);
            }
        }

        if(list.size() == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(list.stream().mapToInt(Integer::intValue).sum());
            System.out.println(Collections.min(list));
        }
    }
}
