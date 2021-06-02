import edu.princeton.cs.algs4.StdRandom;

public class Quick {
    private Quick() {
    }

    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
        assert isSorted(a);
    }

    public static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
        assert isSorted(a, lo, hi);
    }

    public static int partition(Comparable[] a, int low, int hi) {
        
    }

    public static void main(String[] args) {

    }
}
