package pair2;

import javafx.util.Pair;

public class ArrayAlg {
    /**
     * 获取类型为T的对象数组的最小值和最大值
     * @param a T类型的对象数组
     * @param <T>
     * @return 具有最小值和最大值的对，如果a为null或空，则为null
     */
    public static <T extends Comparable> Pair<T, T> minmax(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i ++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }
        return new Pair(min, max);
    }
}
