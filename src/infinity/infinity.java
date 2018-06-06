package infinity;

/**
 * 此程序演示了可变参数的传递
 */
public class infinity {
    public static void main(String[] args) {
        System.out.println(infinity.max(3,5,7,1,9,6));
    }

    public static double max(double ... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double v : values)
        {
            if (v > largest) {
                largest = v;
            }
        }
        return  largest;
    }
}
