package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N15651_N과M3 {

    static int N,M;
    static int[] result;
    static int[] num;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        num = new int[N];
        result = new int[M];

        
        for (int i = 0; i < N; i++) {
            num[i] = i+1;
        }

        func(0);
        System.out.println(sb);

    }

    public static void func(int r) {

        if(r == M) {
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {

            result[r] = num[i];
            func(r+1);

        }

    }

}
