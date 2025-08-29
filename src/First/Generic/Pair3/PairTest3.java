package First.Generic.Pair3;

import First.Generic.Pair;

public class PairTest3 {
    public record Employee() {
    }

    public static void main(String[] args) {

    }

    public static void printBuddies(Pair<? extends Employee> p) {

    }

}


class ArrayAlg {
    public static boolean hasNulls(Pair<?> p) {
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(Pair<?> p) {
        swapHelper(p);
    }

    public static <T> void swapHelper(Pair<T> p) {
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}