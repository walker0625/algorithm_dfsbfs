import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DfsStudy {

    static int [][] data = {
            {1,2,3,4,5,6,7,8}, // 8명의 사람이 있는데,
            {1,2,3,4,5,600,7,8}, // 게임을 8라운드를 진행
            {1,2,3,4,5,6,7,8}, // 각 사람은 특정 라운드에서 낼 수 있는 퍼포먼스가 다름.
            {1,2,30,4,5,6,7,8},
            {1,2,3,4,5,6,7,8},
            {1,2,3,4,5,6,7,8},
            {1,2,31,4,5,6,7,8},
            {100,2,35,4,5,6,7,8},
    };

    // N명의 사람을 줄 세우는 경우의 수는?
    // N!

    // 4명
    // 1-2-3-4
    // 1-2-4-3
    // 1-3-2-4
    // 1-4-2-3
    // 1-4-3-2
    // ..

    static int N = 8;
    static int R = 8;

    static int MAX = -1;
    public static void main(String[] args) {
//        for(int i = 0; i < data.length; i ++) {
//            for(int j = 0; j < data[i].length; j ++) {
//                System.out.println("i = " + i);
//                System.out.println("j = " + j);
//            }
//        }
        dfs(-1, -1, 0, new boolean[8]);
    }

    static void dfs(int round, int currentPlayer , int score, boolean[] visit) {

        if(currentPlayer >= 0) {
//            System.out.println("이번의 round은 " + round);
            int currentScore = data[round][currentPlayer];
            score += currentScore;
        }

        if(round == R-1) {

            if(MAX < score) {
                System.out.println("새로운 스코어 갱신 : "+score);
                MAX = score;
            }

            return;
        }

        for(int i=0; i < N; i ++ ){
            // 현재 라운드의 n번선수의 점수
            if(!visit[i]) {
                visit[i] = true;
                dfs(round+1, i, score, visit);
                visit[i] = false;
            }
        }

    }

}
