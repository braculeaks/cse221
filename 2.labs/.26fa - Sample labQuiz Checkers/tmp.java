
import java.io.*;
import java.util.*;

class tmp {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = null;
        int nCases;

        nCases = Integer.parseInt(br.readLine());

        while (nCases > 0) 
        {
            nCases--;

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // input

            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());

            boolean didWork = true;

            for (int i = 1; i < n; i++) {
                int r = Integer.parseInt(st.nextToken());

                if (l > r) {
                    pw.println("NO");
                    didWork = false;
                    break;
                } 

                l = r;
            }
            
            if (didWork) pw.println("YES");
        }
        pw.flush();
        pw.close();
        System.exit(0);
    }
}