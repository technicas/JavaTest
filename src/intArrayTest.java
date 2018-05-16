import java.util.Arrays;

public class intArrayTest {
    public static void main(String[] args)
    {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = i;
        }
        System.out.println(Arrays.toString(a));
    }
}
