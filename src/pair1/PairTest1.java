package pair1;

import javafx.util.Pair;

public class PairTest1 {
    public static void main(String[] args) {
        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Pair<String, String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getKey());
        System.out.println("max = " + mm.getValue());
    }
}
