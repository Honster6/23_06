import java.util.Scanner;

public class SzyfrCezara {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String org = scan.nextLine();
        char[] nums = org.toCharArray();
        for (int i = 0; i < org.length(); i++) {
            int x = nums[i];
            x = x + 3;
            if (x != 35) {
                nums[i] = (char) x;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}

