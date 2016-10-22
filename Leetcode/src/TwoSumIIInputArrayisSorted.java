/**
 * Created by XiaochengWen on 16/10/18.
 */
public class TwoSumIIInputArrayisSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=1;
        int[] out = new int[2];
        while ((numbers[0]+numbers[end]<target) && (end<numbers.length-1)){
            end += 1;
        }
        while (end>start){
            while (numbers[start]+numbers[end]<target){
                start += 1;
            }
            if (numbers[start]+numbers[end]==target){
                out[0] = start+1;
                out[1] = end+1;
                return out;
            }
            end -= 1;
        }
        return out;
    }

}
