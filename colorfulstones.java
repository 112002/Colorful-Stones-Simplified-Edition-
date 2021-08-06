import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
public class MainCodeforces1 {
    private static MyScanner in;
    private static PrintStream out;

    public static void main(String[] args) throws IOException {
        boolean LOCAL_TEST = false;
        out = System.out;
        if (LOCAL_TEST) {
            in = new MyScanner("E:\\zin2.txt");
        }
        else {
            boolean usingFileForIO = false;
            if (usingFileForIO) {
                // using input.txt and output.txt as I/O
                in = new MyScanner("input.txt");
                out = new PrintStream("output.txt");
            }
            else {
                in = new MyScanner();
                out = System.out;
            }
        }

        solve();
    }

    private static void solve() throws IOException
    {
        String s = in.nextString();
        String t = in.nextString();
        int pos = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(pos))
                pos++;
        }

        out.println(pos + 1);
    }
    static class MyScanner {
        Scanner inp = null;

        public MyScanner() throws IOException
        {
            inp = new Scanner(System.in);
        }

        public MyScanner(String inputFile) throws IOException {
            inp = new Scanner(new FileInputStream(inputFile));
        }

        public int nextInt() throws IOException {
            return inp.nextInt();
        }

        public long nextLong() throws IOException {
            return inp.nextLong();
        }

        public double nextDouble() throws IOException {
            return inp.nextDouble();
        }

        public String nextString() throws IOException {
            return inp.next();
        }

    }

}