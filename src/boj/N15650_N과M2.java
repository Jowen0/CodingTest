package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N15650_N과M2 {

    static StringBuilder sb;
    static int result[];

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        result = new int[n];
        sb = new StringBuilder();
        comb(0,1, n, m);
        System.out.println(sb);

    }

    public static void comb(int dept, int start, int n, int m) {

        if(dept == m) {

            for (int i = 0; i < m; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= n; i++) {
            result[dept] =  i;
            comb(dept+1,i+1,n,m);
        }

    }

}
