package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N9663_N_Queen {

    static int CNT = 0;
    static int N;

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        boolean[][] chessBoard = new boolean[N][N];
        for(int i = 0; i < N; i++) {
            putQueen(i,0, chessBoard);
        }
        System.out.println(CNT);
    }

    public static void putQueen(int x, int y, boolean[][] chessBoard) {

        if(y == N-1 && !chessBoard[x][y]) {
            CNT++;
            return;
        }

        if(!chessBoard[x][y]) {
            chessBoard[x][y] = true;
            checkBoard(x,y, chessBoard);
            putQueen(0,y+1, chessBoard);
        }

        putQueen(x+1, y, chessBoard);

    }

    public static void checkBoard(int x, int y, boolean[][] chessBoard) {

        if(x == N-1 || y == N-1) {
            return;
        }

        for (int i = x; i < 0; i--) {
            chessBoard[x][y] = true;
            checkBoard(x-1,y, chessBoard);
            checkBoard(x-1,y+1, chessBoard);
        }

        for (int i = x; i < N; i++) {
            chessBoard[x][y] = true;
            checkBoard(x+1,y, chessBoard);
            checkBoard(x+1,y+1, chessBoard);
        }

    }

}
