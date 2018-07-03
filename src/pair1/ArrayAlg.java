package pair1;

import javafx.util.Pair;

/**
 * 该程序演示一个简单泛型的使用
 */
public class ArrayAlg {
    /**
     * 获取字符串数组的最小值和最大值
     * @param a 一个字符串数组
     * @return 具有最小值和最大值的Pair对，如果a为null或空，则为null
     */
    public static Pair<String, String> minmax(String[] a)
    {
        if (a == null || a.length == 0) {
            return null;
        }

        String min = a[0];
        String max = a[0];

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
