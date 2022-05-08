import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_9184 {

    public static Integer[] dp = new Integer[3];

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    }


    
    public static int w(int a, int b, int c){
        if (a<=0 || b<=0 || c<=0){
            return 1;
        }
        else if(a>20 || b>20 || c>20){
            return w(20, 20, 20);
        }
        else{

        }
    }
}
