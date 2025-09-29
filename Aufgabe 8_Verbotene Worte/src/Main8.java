
import java.util.Objects;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int verbotenesWortCounter = 0;

        System.out.println("Dein Kommentar: ");
        String kommentar = scanner.nextLine();

        String[] verboteneWorte = { "viagra", "sex", "porno", "fick", "schlampe", "arsch", "mullet"};

        for (String s : verboteneWorte) {
            if (kommentar.contains(s)) {
                verbotenesWortCounter++;
            }
        }

        if  (verbotenesWortCounter > 0) {
            System.out.println("Dein Kommentar enthält " + verbotenesWortCounter + " verbotene Wörter.");
            System.out.println("Er wird nicht veröffentlicht.");
        } else {
            System.out.println("Vielen Dank für deinen Kommentar.");
        }
    }
}