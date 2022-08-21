import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(DFS(n));

        br.close();
    }

    private static int DFS(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n*DFS(n-1);
        }
    }


}
