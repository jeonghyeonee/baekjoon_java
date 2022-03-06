import java.util.HashMap;
import java.util.Scanner;

public class Baekjoon_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.nextLine();

        HashMap<Integer, String> info = new HashMap<>();

        for(int i=0; i<N; i++){
            info.put(sc.nextInt(), sc.next());
        }

        
    }
}
