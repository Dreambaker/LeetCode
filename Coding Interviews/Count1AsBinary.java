/**
 * 面试题15. 二进制中1的个数
 */
public class Count1AsBinary {
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }

}
