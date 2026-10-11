import java.util.*;
import java.io.*;

public class f 
{
    public static StringTokenizer nextLine(BufferedReader br) throws Exception {
        return new StringTokenizer(br.readLine());
    }

    public static int nextInt(StringTokenizer st) {
        return Integer.parseInt(st.nextToken());
    }

    public static long nextLong(StringTokenizer st) {
        return Long.parseLong(st.nextToken());
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer line = nextLine(br);
        int n = nextInt(line);

        line = nextLine(br);

        int[] arr = new int[n];
            for (int i = 0; i < n; i++) 
                arr[i] = nextInt(line);

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++)         // BubbleSort + BruteForce
            {
                int x = arr[j-1];
                int y = arr[j];

                if ((x % 2 == 0) && (y % 2 != 0)) continue;
                if ((x % 2 != 0) && (y % 2 == 0)) continue;

                if (x > y) {
                    arr[j-1] = y;
                    arr[j]   = x;
                }
            }
        }

        for (int i = 0; i < n; i++) 
            pw.print(arr[i] + " ");

        pw.println();

        pw.flush();
        pw.close();
        System.exit(0);
    }
}