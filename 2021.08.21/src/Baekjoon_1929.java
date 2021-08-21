import java.util.Scanner;

public class Baekjoon_1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n+1];

        for(int i=0; i<=n; i++){
            arr[i] = 0;
        }

        arr[1] = 1;

        for(int i=2; i<n+1; i++){
            if(arr[i] == 0){
                if((int)Math.pow(i, 2)>1000000){
                    break;
                }
                else{
                    for(int j=(int)Math.pow(i, 2); j<n+1; j = j+i){
                        arr[j] = 1;
                    }
                }
            }
        }
        for(int i=m; i<n+1; i++){
            if(arr[i] != 1){
                System.out.println(i);
            }
        }


    }
}
