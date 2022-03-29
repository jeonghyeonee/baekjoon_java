import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2580 {

    public static int[][] arr = new int[9][9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sudoku(0,0);

    }

    public static void sudoku(int row, int col){
        if(col == 9){
            sudoku(row+1, 0);
            return;
        }

        if(row == 9){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    sb.append(arr[i][j]).append(' ');
                }
                sb.append('\n');
            }
            System.out.println(sb);

            System.exit(0);
        }

        if(arr[row][col] == 0){
            for (int i=1; i<=9; i++){
                if(possibility(row, col, i)){
                    arr[row][col] = i;
                    sudoku(row, col+1);
                }
            }
            arr[row][col] = 0;
            return;
        }
        sudoku(row, col+1);
    }

    public static boolean possibility(int row, int col, int val){
        // row에 겹치는지 확인
        for(int i=0; i<9; i++){
            if (arr[row][i] == val){
                return false;
            }
        }

        // column에 겹치는지 확인
        for(int i=0; i<9; i++){
            if(arr[i][col] == val){
                return false;
            }
        }

        // 3X3 checking
        int r = (row/3)*3;
        int c = (col/3)*3;

        for(int i=r; i<r+3; i++){
            for(int j=c; j<c+3; j++){
                if(arr[i][j] == val){
                    return false;
                }
            }
        }
        return true;
    }
}
