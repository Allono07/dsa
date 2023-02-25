package dsaPractice;

import java.util.HashSet;
import java.util.Set;
public class singleNumber{
    public static void main(String args[]){
        int[] nums = new int[10];
        Solution3 obj = new Solution3();
        obj.singleNumber(nums);
    }

}
class Solution3 {
    public int singleNumber(int[] nums) {
        Set<Integer> uniqueElements = new HashSet<>();
        for(int num:nums){
            if (!uniqueElements.add(num)) {
                uniqueElements.remove(num);
            }
        }
        return uniqueElements.iterator().next();

    }
}
