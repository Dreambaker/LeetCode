/**
 * 面试题17. 打印从1到最大的n位数
 */
public class printNumbersForm1To10N {
    public int[] printNumbers(int n) {
        int length = (int)(Math.pow(10,n));
        int[] res = new int[n-1];
        for (int i = 0; i < 10*n-1; i++) {
            res[i]=i+1;
        }
        return res;
    }
}
