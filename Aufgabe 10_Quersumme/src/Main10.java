import java.util.InputMismatchException;
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
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Geben Sie die Zahl ein deren Quersumme Sie berechnen wollen.");
            int zahl = scanner.nextInt();
            System.out.println("Die Quersumme ist: " + berechneQuersumme(zahl));
        } catch (InputMismatchException e) {
            System.out.println("Bitte geben Sie eine ganze Zahl ein!");
        }
        catch (Exception e) {
            System.out.println("Ein Fehler ist aufgetreten!" + e);
        }
    }
}