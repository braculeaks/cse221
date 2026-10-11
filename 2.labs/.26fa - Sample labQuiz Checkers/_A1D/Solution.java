import java.io.*;
import java.util.*;

class Solution 
{
    public static int nextInt(StringTokenizer st) {
        return Integer.parseInt(st.nextToken());
    }
    public static StringTokenizer nextLine(BufferedReader br) throws IOException {
        return new StringTokenizer(br.readLine());
    }

    public static void main(String[] args) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer line = nextLine(br);
        int nCases;

        nCases = nextInt(line);

        while (nCases > 0) 
        {
            nCases--;

            line = nextLine(br);
            int n = nextInt(line); // input

            line = nextLine(br);
            int l = nextInt(line);

            boolean didWork = true;

            for (int i = 1; i < n; i++) {
                int r = nextInt(line);

                if (l > r) {
                    didWork = false;
                    break;
                } 

                l = r;
            }
            
            if (didWork) pw.println("YES");
            else         pw.println("NO");
        }
        pw.flush();
        pw.close();
        System.exit(0);
    }
}