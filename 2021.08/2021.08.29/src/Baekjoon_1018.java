import java.util.Scanner;

public class Baekjoon_1018 {
    static boolean[][] arr;
    static int min = 64;

    static void find(int x, int y){
        int end_x = x+8;
        int end_y = y+8;
        int cnt = 0;

        boolean TF = arr[x][y];

        for(int i=x; i<end_x; i++){
            for(int j=y; j<end_y; j++){
                if(arr[i][j] != TF){
                    cnt++;
                }
                TF = (!TF);
            }
            TF = !TF;
        }
        cnt = Math.min(cnt, 64-cnt);
        min = Math.min(min, cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new boolean[n][m];

        sc.nextLine();

        for(int i=0; i<n; i++){
            String str = sc.nextLine().trim();

            for(int j=0; j<m; j++){
                if(str.charAt(j)=='W'){
                    arr[i][j] = true;
                }else{
                    arr[i][j] = false;
                }
            }
        }

        int nr = n-7;
        int mr = m-7;

        for(int i=0; i<nr; i++){
            for(int j=0; j<mr; j++){
                find(i, j);
            }
        }
        System.out.println(min);;


    }
}

//https://st-lab.tistory.com/101 -> 참고용 사이트