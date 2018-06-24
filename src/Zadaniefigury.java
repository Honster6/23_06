import javax.swing.*;
import java.util.Scanner;

public class Zadaniefigury {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wysokość: ");
        int h = scan.nextInt();
        System.out.println("Pierwsza figura: ");
        figure1(h);
        System.out.println("Druga figura: ");
        figure2(h);
        System.out.println("Trzecia figura: ");
        figure3(h);
    }

    static void figure1(int h) {
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j <= (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void figure2(int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }

    static void figure3(int h) {
        for (int i = 1; i <= h; i++){
            if (i == 1 || i == h){
                for (int j = 1; j < h; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.println();



            }

        }

    }

}
