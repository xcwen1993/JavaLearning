/**
 * Created by XiaochengWen on 16/10/16.
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char diff=0;
        int x;
        String s1 = s+t;
        for (int i=0;i<s1.length();i++){
            diff ^= s1.charAt(i);
        }
        return diff;
    }
}
