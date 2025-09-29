import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean verbotenesWortEnthalten = false;
        int verbotenesWortCounter = 0;
        System.out.println("Dein Kommentar: ");
        String kommentarAnfang = scanner.nextLine();

        String[] verboteneWorte = { "viagra", "sex", "porno", "fick", "schlampe", "arsch", "mullet"};

        String[] kommentarInEinzelnenWorten = kommentarAnfang.toLowerCase().split(" ");

        for (int t = 0; t <= kommentarInEinzelnenWorten.length-1; t++) {
            for (int q = 0; q <= 6; q++) {
                if (Objects.equals(verboteneWorte[q], kommentarInEinzelnenWorten[t])) {
                     verbotenesWortEnthalten = true;
                     verbotenesWortCounter++;
                    }
                }
            }
        if  (verbotenesWortEnthalten) {
            System.out.println("Dein Kommentar enthält " + verbotenesWortCounter + " verbotene Wörter.");
            System.out.println("Er wird nicht veröffentlicht.");
        } else {
            System.out.println("Vielen Dank für deinen Kommentar.");
        }
    }
}