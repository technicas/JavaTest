package comparator;

import java.util.Arrays;

/**
 * 该程序演示了按照字符串长度排序数组
 * 主要演示了接口的另一个用法，不在对象本身调用
 */
public class LengthComparatorTest {
    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary" };

        Arrays.sort(friends, new LengthComparator());
        /*
        for (int i = 0; i < friends.length; i ++) {
            System.out.println(friends[i]);
        }
        */

        for (String f : friends) {
            System.out.println(f);
        }
    }
}
