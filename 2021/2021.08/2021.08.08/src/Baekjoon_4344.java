import java.util.Scanner;

public class Baekjoon_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        for(int i=0; i<c; i++){
            int n = sc.nextInt();       //학생 수
            double[] s = new double[n];
            double sum = 0;
//            학생들의 성적 입력
            for(int j=0; j<n; j++){
                s[j] = sc.nextDouble();
                sum += s[j];
            }
            double mean = sum/n;    //학생들의 평균
            double cnt = 0;
            for(double k: s){
                if (k>mean){
                    cnt += 1;
                }
            }

            System.out.printf("%.3f%%\n", (cnt/n)*100);
        }
    }
}
