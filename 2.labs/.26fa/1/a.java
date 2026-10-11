import java.util.*;
import java.io.*;

public class a 
{
    public static StringTokenizer nextLine(BufferedReader br) throws Exception {
        return new StringTokenizer(br.readLine());
    }

    public static int nextInt(StringTokenizer st) {
        return Integer.parseInt(st.nextToken());
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
            int x = nextInt(line);

            if ((x & 1) == 0) pw.println(x + " is an Even number.");
            else              pw.println(x + " is an Odd number.");
        }

        pw.flush();
        pw.close();
        System.exit(0);
    }
}