import java.util.*;
import java.io.*;

public class c 
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
        int nCases = nextInt(line);

        while (nCases > 0) 
        {
            nCases--;

            line = nextLine(br);
            long x = nextInt(line);

            long ans = (x)*(x+1);
                 ans = ans / 2;

            pw.println(ans);
        }

        pw.flush();
        pw.close();
        System.exit(0);
    }
}