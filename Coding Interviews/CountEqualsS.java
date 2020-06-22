import java.util.ArrayList;
import java.util.List;

public class CountEqualsS {
    public static int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int left =1 ;int right =1;
        while(right <target+1/2) {
            if (count(left, right) > target) {
                left++;
            } else if (count(left, right) == target) {
                int[] seq = new int[right - left + 1];
                for (int i = 0; i < right - left + 1; i++)
                    seq[i] = left + i;
                res.add(seq);
                left++;
            } else if (count(left, right) < target) {
                right++;
            }
        }
        return res.toArray(new int[0][]);
    }
    public static int count (int min, int max){
        return ( min + max )*(max - min+1 ) / 2;
    }

    public static void main(String[] args) {
        int[][] res= findContinuousSequence(9);
        System.out.println(res);

    }
}
