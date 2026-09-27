import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        // write code in Solution.java
        System.exit(0); // exits the program immediately, nothing below executes

        // fastIO example below
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        long t, n, m, a[] = new long[8], b[] = new long[8], c[] = new long[8];

        t = Long.parseLong(br.readLine()); // input a single integer in one line
        // input a pair of integers in one line
        st = new StringTokenizer(br.readLine());
        n = Long.parseLong(st.nextToken());
        m = Long.parseLong(st.nextToken());
        // input n integers in one line
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) a[i] = Long.parseLong(st.nextToken());
        // input m pairs of integers in m lines
        for (int i = 0; i < m; ++i) {
            st = new StringTokenizer(br.readLine());
            b[i] = Long.parseLong(st.nextToken());
            c[i] = Long.parseLong(st.nextToken());
        }

        pw.println(t); // output a single integer in one line
        // output a pair of integers in one line
        pw.println(n + " " + m);
        // output n integers in one line
        for (int i = 0; i < n; ++i) {
            if (i != 0) pw.print(" ");
            pw.print(a[i]);
        }
        pw.println();
        // output m pairs of integers in m lines
        for (int i = 0; i < m; ++i) pw.println(b[i] + " " + c[i]);
        // force output all items in the buffer up to now together
        pw.flush(); // flush only once at the end of the program

        /* input = output
2
3 4
5 6 7
8 9
1 2
3 4
5 6

        */
    }
}