import java.util.InputMismatchException;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wie viele Kilometer möchtest du rennen?");
            int anzahlWunschKilometer = scanner.nextInt();

            if (anzahlWunschKilometer > 42) {
                System.out.println("Das schaffst du nicht!");
            } else {
                int anzahlWunschKilometerInMeter = anzahlWunschKilometer * 1000;
                int runden = anzahlWunschKilometerInMeter / 400;

                System.out.println("Das sind " + runden + " Runden. Bereit für den Lauf? (y/n)");
                if (scanner.next().equals("y")) {
                    for (int i = 1; i <= runden; i++) {
                        System.out.println("Du läufst Runde " + i);
                    }
                    System.out.println("Du hast es geschafft!");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Bitte geben Sie einen korrekten Input ein!");
        }
        catch (Exception e) {
            System.out.println("Ein Fehler ist aufgetreten!" + e);
        }


    }
}