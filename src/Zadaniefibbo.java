import java.util.Scanner;

public class Zadaniefibbo {

    public static int fibborekur(int a) {
        if (a == 0) {
            return 0;
        }
        if (a == 1 || a == 2) {
            return 1;
        } else return fibborekur(a - 1) + fibborekur(a - 2);
    }

    public static int fibboiter(int a) {
        int x = 0;
        int y = 1;
        for (int i = 2; i <= a; i++) {
            y = y + x;
            x = y - x;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pozycję w ciągu: ");
        int a = scan.nextInt();
        System.out.println("Na podanej pozycji wartość liczby wynosi (REKURENCJA): " + fibborekur(a));
        System.out.println("Na podanej pozycji wartość liczby wynosi (ITERACJA)" + fibboiter(a));
    }
}

