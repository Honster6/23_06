import java.util.Scanner;

public class Zadanie1iter {
    public static int silniaiter(int a) {
        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static int silniarekur(int a) {
        if (a == 1 || a == 0) {
            return 1;
        } else return a * silniarekur(a - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaje liczbę: ");
        int a = scan.nextInt();
        System.out.println("Silnia podanej liczby wonosi (REKURENCJA): " + silniarekur(a));
        System.out.println("Silnia podanej liczby wynosi (ITERACJA): " + silniaiter(a));
    }
}
