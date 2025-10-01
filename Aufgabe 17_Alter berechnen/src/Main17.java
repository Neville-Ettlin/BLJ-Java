import java.time.Instant;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main17 {

    public static String reverseGeburtsdatum (String geburtsdatum) {
        StringBuilder reversedNameBuilder = new StringBuilder();
        StringBuilder subNameBuilder = new StringBuilder();

        for (int i = 0; i < geburtsdatum.length(); i++) {

            char currentChar = geburtsdatum.charAt(i);

            if (currentChar != '-') {
                subNameBuilder.append(currentChar);
            } else {
                reversedNameBuilder.insert(0, currentChar + subNameBuilder.toString());
                subNameBuilder.setLength(0);
            }
        }
        return reversedNameBuilder.insert(0, subNameBuilder).toString();
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ihr Geburtsdatum: ");
            String geburtsdatum = scanner.nextLine();
            geburtsdatum = geburtsdatum.replace(".", "-");

            String geburtsdatumVollstandig = reverseGeburtsdatum(geburtsdatum) + "T00:00:00.000Z";

            Instant instantGeburtstag = Instant.parse(geburtsdatumVollstandig);
            long millisekundenSeitGeburtsdatum = instantGeburtstag.toEpochMilli();

            Instant instantAktuell = Instant.now();
            long millisekundenSeitAktuell = instantAktuell.toEpochMilli();

            System.out.println("Alter in Jahren: " + (millisekundenSeitAktuell - millisekundenSeitGeburtsdatum) / 31536000000L);
            System.out.println("Alter in Monaten: " + (millisekundenSeitAktuell - millisekundenSeitGeburtsdatum) / 2629746000L);
            System.out.println("Alter in Wochen: " + (millisekundenSeitAktuell - millisekundenSeitGeburtsdatum) / 604800000L);
            System.out.println("Alter in Tagen: " + (millisekundenSeitAktuell - millisekundenSeitGeburtsdatum) / 86400000L);
        }
        catch (InputMismatchException e) {
            System.out.println("Bitte geben Sie nur ein vollständiges Datum ein!");
        } catch (Exception e) {
            System.out.println("Ein Fehler ist aufgetreten!" + e);
        }
        }
}