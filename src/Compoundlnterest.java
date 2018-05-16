/**
 * 该程序显示了如何将表格数据存储在二维数组中。
 */
public class Compoundlnterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int YEARS = 10;

        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (STARTRATE + j) / 100;
        }
    }
}
