import java.util.Scanner;

public class Baekjoon_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] score = new double[n];

//과목 수 만큼 점수 입력받기
        for(int i=0; i<n; i++){
            score[i] = sc.nextInt();
        }

//최댓값 찾기
        double max = 0;
        for(double j : score){
            if (j > max) {
                max = j;
            }
        }

//점수 조정 및 총합 구하기
        double s = 0;
        for(double k: score){
            s += k/max*100;
        }

        System.out.println(s/n);

    }
}

//int array로 입력 받을 경우 0으로 환산되는 경우 발생
