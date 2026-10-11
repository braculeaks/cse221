import java.io.*;
import java.util.*;

class Solution {
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
            long x = Integer.parseInt(st.nextToken());      // int = 32bit, long = 64bit    

            long ans = x*(x+1);
                 ans = ans / 2;
            
            pw.println(ans);
        }

        pw.flush();
        pw.close();
        System.exit(0);
    }
}