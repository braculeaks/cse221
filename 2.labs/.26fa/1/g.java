import java.util.*;
import java.io.*;

public class g 
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
            int n = nextInt(line); // input

            line = nextLine(br);
            int[] ID = new int[n];
                for (int i = 0; i < n; i++) 
                    ID[i] = nextInt(line);

            line = nextLine(br);
            int[] mark = new int[n];
                for (int i = 0; i < n; i++) 
                    mark[i] = nextInt(line);
            
            // -------- Taking all kinds of input for a testCase is done --------





            int ans = 0;

            for (int i = 0; i < n; i++) {           // SelectionSort
                int maxAt = i;

                for (int j = i+1; j < n; j++) 
                {
                         if (mark[maxAt]  < mark[j])                      maxAt = j;
                    else if (mark[maxAt] == mark[j] && ID[maxAt] > ID[j]) maxAt = j;
                }

                if (maxAt == i) continue;
                else {
                    ans++;
                    int k = maxAt;

                    int tmp = mark[i];
                    mark[i] = mark[k];
                    mark[k] = tmp;

                    tmp = ID[i];
                    ID[i] = ID[k];
                    ID[k] = tmp;
                }
            }

            pw.println("Minimum swaps: " + ans);
            for (int i = 0; i < n; i++)
                pw.println("ID: " + ID[i] + " Mark: " + mark[i]);
        }

        


        pw.flush();
        pw.close();
        System.exit(0);
    }
}