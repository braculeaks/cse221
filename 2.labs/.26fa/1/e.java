import java.util.*;
import java.io.*;

public class e 
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

        ArrayList<Integer> swaps = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            for (int j = 2; j < n; j++)         // BubbleSort + BruteForce
            {
                int x = arr[j-2];
                int y = arr[j];

                if (x > y) {
                    swaps.add(j);
                    arr[j-2] = y;
                    arr[j]   = x;
                }
            }
        }

        // 2. Checking if sorted
        boolean isSorted = true;
        for (int i = 1; i < n; i++) {
            if (arr[i-1] > arr[i]) {
                isSorted = false;
                break;
            }
        }
        
        if (isSorted) {
            pw.println("YES");
            pw.println(swaps.size());
            for (int x : swaps) 
            {
                int l = x-2;
                int r = x;

                l++;    // bcz they want us to print, real world index (starting from 0), not PC RAM index (starting from 1)
                r++;

                pw.println(l + " " + r);
            }
        }
        else
            pw.println("NO");
        

        pw.flush();
        pw.close();
        System.exit(0);
    }
}