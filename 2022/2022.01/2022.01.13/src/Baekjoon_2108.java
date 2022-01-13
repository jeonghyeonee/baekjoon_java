//https://st-lab.tistory.com/108

import java.util.Scanner;

public class Baekjoon_2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[8001];  // 입력값의 범위: -4000 ~ 4000
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 10000;
        int mode = 10000;

        // 주어진 길이만큼 배열에 넣기
        for(int i=0; i<n; i++){
            int value = sc.nextInt();
            sum += value;
            arr[value + 4000]++;

            if(max < value){
                max = value;
            }
            if(min > value){
                min = value;
            }
        }

        int cnt = 0;
        int mode_max = 0;

        boolean flag = false;

        for(int i=min+4000; i<=max+4000; i++){
            if(arr[i] > 0){
                // 중앙값 찾기
                if(cnt < (n+1)/2){
                    cnt += arr[i];
                    median = i-4000;
                }

                // 최빈값 찾기
                if(mode_max < arr[i]){
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true;
                }
                else if(mode_max == arr[i] && flag == true){
                    mode = i-4000;
                    flag = false;
                }
            }
        }

        System.out.println((int)Math.round((double)sum/n));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max-min);

    }
}
