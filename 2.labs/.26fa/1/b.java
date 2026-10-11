import java.util.*;
import java.io.*;

public class b
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
            line.nextToken();

            long x = nextInt(line);
            String op = line.nextToken();
            long y = nextInt(line);

                 if (op.equals("+"))    pw.println(x+y);
            else if (op.equals("-"))    pw.println(x-y);
            else if (op.equals("*"))    pw.println(x*y);

            else if (op.equals("/"))    pw.println(x/y);
            else if (op.equals("%"))    pw.println(x%y);

            else if (op.equals("&"))    pw.println(x&y);
            else if (op.equals("|"))    pw.println(x|y);

            else if (op.equals("^"))    pw.println(x^y);
            else if (op.equals("<<"))   pw.println(x<<y);
            else if (op.equals(">>"))   pw.println(x>>y);
        }

        pw.flush();
        pw.close();
        System.exit(0);
    }
}