package dsaPractice;
import java.util.Random;

public class BaseSeven {
    public static void main(String[] args) {
        Random random = new Random();
        int num=random.nextInt();
        Solution cb = new Solution();
        cb.convertToBase7(num);


    }
}
class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }
        while(num ==0){
            return "0";
        }
        while (num >0){
            sb.append(num%7);
            num = num/7;
        }
        if (isNegative) {
            sb.append("-");
        }
        return sb.reverse().toString(); // Your code goes here
    }
}