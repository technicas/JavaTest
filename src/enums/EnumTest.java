package enums;

import arrayList.Size;

import java.util.Scanner;

/**
 * 该程序演示枚举类型。
 * Enum.valueOf(Size.class, input),这里有些不太明白，为什么要传Size.class
 */
public class EnumTest {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARCE) ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);

        System.out.println("size = " + size);
        System.out.println("abbreviation = " + size.getAbbreviation());
        System.out.println("ord = " + size.ordinal());

        if(size == Size.EXTRA_LARGE) {
            System.out.println("Good job you paid attention to the");
        }

    }
}
