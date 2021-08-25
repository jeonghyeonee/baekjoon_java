import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Baekjoon_11729_time {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void hanoi(int n, int from_p, int to_p, int aux_p) throws IOException {
        if (n == 1) {
            bw.write(from_p + " " + to_p+ "\n");
            return;
        }
        hanoi(n - 1, from_p, aux_p, to_p);
        bw.write(from_p + " " + to_p+ "\n");
        hanoi(n - 1, aux_p, to_p, from_p);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bw.write((int) (Math.pow(2, n) - 1) + "\n");
        hanoi(n, 1, 3, 2);
        bw.flush();
        bw.close();
        ;
    }
}
