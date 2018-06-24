public class Zadanie_Ciagi {


    public static void main(String[] args) {
        alg1(10);
        System.out.println();
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.setMaximumFractionDigits(0);
        alg2(10);
        System.out.println();
        alg3(10);
        System.out.println();
        alg4(10);
    }

    static void alg1(int n) {
        System.out.println("Ciag pierwszy: ");
        for (int i = 1; i < n * 2; i += 2) {
            System.out.print(i + ", ");
        }
    }

    static void alg2(int n) {
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.setMaximumFractionDigits(0);
        System.out.println("Ciąg drugi: ");
        double x = (-1);
        System.out.print(df.format(x) + ", ");
        for (int i = 1; i < n; i++) {
            x = x + Math.pow(2, i);
            System.out.print(df.format(x) + ", ");
        }
    }

    static void alg3(int n) {
        System.out.println("Ciąg trzeci: ");
        boolean direction = true;
        int result = 2;
        for (int i = 1; i < n; i++) {
            System.out.print(result + ", ");
            if (direction) {
                result += 2;
            } else {
                result -= 2;
            }
            if (result == 8 || result == 2) {
                direction = !direction;
            }

        }

    }

    static void alg4(int n) {
        System.out.println("Ciąg czwarty: ");
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            b = b + a;
            System.out.print(b + ", ");
            a = b - a;
        }
    }
}



