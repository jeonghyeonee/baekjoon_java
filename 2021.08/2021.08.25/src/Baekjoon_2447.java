import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2447 {
    static char[][] arr;

    static void star(int x,int y, int num){
        if (num==1){
            arr[x][y] = '*';
            return;
        }
        int value = num/3;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==1 && j==1);
                else star(x+(value*i), y+(value*j), value);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int s = Integer.parseInt(sc.nextLine());
        arr = new char[s][s];

        for(int i=0; i<s; i++){
            Arrays.fill(arr[i], ' ');
        }
        star(0, 0, s);
        for(int i=0; i<s; i++){
            for(int j=0; j<s; j++){
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
