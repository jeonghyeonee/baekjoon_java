import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


public class Baekjoon_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt()%42;
        }

        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
//        자바 8을 이용하여 위와 같은 방법으로 array를 set으로 바꾸어야 함

        System.out.println(set.size());

    }
}
