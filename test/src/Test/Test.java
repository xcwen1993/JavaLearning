package Test;


import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        System.out.println(-1 << 1);
        TreeSet<Integer> a = new TreeSet<Integer>();
        String s = "aback";
        s.toUpperCase();
        a.add(1);
        a.add(2);
        a.add(5);
        a.add(11);
        a.add(7);

        System.out.println(a);

    }

    public static <T> T get(T o) {
        return o;
    }
}