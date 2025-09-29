import java.util.Scanner;
public class Main10 {

    static int berechneQuersumme(int zahl) {
        int summe = 0;
        while (zahl != 0) {
            summe = summe + (zahl % 10);
            zahl = zahl / 10;
        }
        return summe;
    }
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die Zahl ein deren Quersumme Sie berechnen wollen.");
        int zahl = scanner.nextInt();
        System.out.println("Die Quersumme ist: " + berechneQuersumme(zahl));
    }
}