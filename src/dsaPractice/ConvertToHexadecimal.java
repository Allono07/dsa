package dsaPractice;

public class ConvertToHexadecimal {
    public static void main(String arsg[]){
        int num = 100;
        Solution1 obj= new Solution1();
        obj.toHex(num);
    }
}
class Solution1 {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(map[num & 15]);
            num = (num >>> 4);
        }
        return sb.reverse().toString();
    }
}
