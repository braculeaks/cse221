import java.util.*;
import java.io.*;

public class h
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

        Train[] trains = new Train[n];
            for (int i = 0; i < n; i++) {
                line = nextLine(br);
                String name = line.nextToken();
                line.nextToken();
                line.nextToken();
                line.nextToken();
                String dest = line.nextToken();
                line.nextToken();
                String clock = line.nextToken();        // 23:05

                trains[i] = new Train(name, dest, clock, i);
            }

        // -------- Taking all kinds of input for a testCase is done --------




        for (int i = 0; i < n; i++) {       // Running SelectionSort
            int maxAt = i;

            for (int j = i+1; j < n; j++) 
            {
                String x = trains[maxAt].n;
                String y = trains[j].n;

                int xt = trains[maxAt].time;
                int yt = trains[j].time;

                int xi = trains[maxAt].id;
                int yi = trains[j].id;

                     if (x.compareTo(y)  > 0)                             maxAt = j;
                else if (x.compareTo(y) == 0 && (xt < yt))                maxAt = j;
                else if (x.compareTo(y) == 0 && (xt == yt) && (xi > yi))  maxAt = j;
            }

            if (maxAt == i) continue;
            else {
                int k = maxAt;

                Train tmp = trains[i];
                trains[i] = trains[k];
                trains[k] = tmp;
            }
        }


        for (int i = 0; i < n; i++)
            pw.println(trains[i]);


        pw.flush();
        pw.close();
        System.exit(0);
    }
}




class Train {
    String n;
    String d;
    String c;
    int id;
    int time;       // departure time in minutes

    Train(String name, String dest, String clock, int ID) {
        n = name;
        d = dest;
        c = clock;
        id = ID;

        int hours   = Integer.parseInt(clock.substring(0, 2));
        int minutes = Integer.parseInt(clock.substring(3, 5));
        this.time   = hours*60 + minutes;
    }

    public String toString() {
        return n + " will departure for " + d + " at " + c;
    }
}