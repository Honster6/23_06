import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanieczytaniezpliku {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/numbers.txt");
        Scanner sc = new Scanner(file);
        /*while (sc.hasNext()) {   //dopóki jest cos w linii do tej pory czyta
            System.out.println(sc.nextLine());  //wypisanie kolejnych linii pliku
        }*/
        int[] nums = new int[4];

        for (int i = 0; i < nums.length; i++) {
            if (sc.hasNext()) {
                nums[i] = sc.nextInt();
            }
            System.out.println(nums[i]);
        }
        System.out.println();
        int[] nums2 = new int [4];
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            nums2[i] = sum;
            System.out.println(nums2[i]);
        }

    }
}









