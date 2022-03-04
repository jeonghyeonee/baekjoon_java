import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baekjoon_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        String arr[] = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        // 같은 단어에 대해서 어떻게 처리할 것인가? -> 집합?
        // Comparator 좀 더 알아보기!!!!
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);    //사전 순 정렬
                }
                else{
                    return o1.length() - o2.length();
                }
            }
        });

        System.out.println(arr[0]);

        for(int i=1; i<n; i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }

    }
}
