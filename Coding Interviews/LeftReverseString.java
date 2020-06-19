/**
 * 面试题58 - II. 左旋转字符串
 */
public class LeftReverseString {
    public static String reverseLeftWords(String s, int n){

        return s.substring(n) + s.substring(0,n);

    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg" ,2));
    }
}
