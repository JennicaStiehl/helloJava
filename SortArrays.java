import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {
        String s = StdIn.readAll();
        String[] words = s.split("\\s+");

        Arrays.sort(words);

        String prev = "";
        for (int i = 0; i < words.length; i++) {
            if (i == 0 || !words[i].equals(words[i - 1]))
                StdOut.println(words[i]);
        }
    }
}
