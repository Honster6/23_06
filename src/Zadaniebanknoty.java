import java.util.Scanner;

public class Zadaniebanknoty {
    public static void main(String[] args) {
        System.out.println("Podaj kwotę: ");
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();

        int dwusetki = 0;
        int setki = 0;
        int piecdz = 0;
        int dwudz = 0;
        int dz = 0;
        int piatki = 0;
        int dwojki = 0;
        int jedynki = 0;
        int piecdzgr = 0;
        int dwadzgr = 0;
        int dzgr = 0;
        int piecgr = 0;
        int dwagr = 0;
        int jedgr = 0;

        while (n >= 200) {
            dwusetki++;
            n = n - 200;
            System.out.println("200");
        }
        while (n >= 100) {
            setki++;
            n = n - 100;
            System.out.println("100");
        }
        while (n >= 50) {
            piecdz++;
            n = n - 50;
            System.out.println("50");
        }
        while (n >= 20) {
            dwudz++;
            n = n - 20;
            System.out.println("20");
        }
        while (n >= 10) {
            dz++;
            n = n - 10;
            System.out.println("10");
        }
        while (n >= 5) {
            piatki++;
            n = n - 5;
            System.out.println("5");
        }
        while (n >= 2) {
            dwojki++;
            n = n - 2;
            System.out.println("2");
        }
        while (n >=1) {
            jedynki++;
            n = n - 1;
            System.out.println("1");
        }
        while (n >= 0.5) {
            piecdzgr++;
            n = n - 0.5;
            System.out.println("0.50");
        }
        while (n >= 0.2) {
            dwadzgr++;
            n = n - 0.2;
            System.out.println("0.20");
        }
        while (n >= 0.1) {
            dzgr++;
            n = n - 0.1;
            System.out.println("0.10");
        }
        while (n >= 0.05) {
            piecgr++;
            n = n - 0.05;
            System.out.println("0.05");
        }
        while (n >= 0.02) {
            dwagr++;
            n = n - 0.02;
            System.out.println("0.02");
        }
        while (n >= 0.01) {
            jedgr++;
            n = n - 0.01;
            System.out.println("0.01");
        }


    }
}
