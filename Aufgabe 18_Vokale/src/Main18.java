import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vokale = {"a", "e", "i", "o", "u", "ä", "ü", "ö"};
        int[] vokaleCounter = new int[vokale.length];

        String eingabe = scanner.nextLine();
        String[] eingabeArray = eingabe.split("");

        for (int i = 0; i < eingabeArray.length; i++) {
            for (int p = 0; p < vokale.length; p++) {
                if (Objects.equals(eingabeArray[i], vokale[p])) {
                    vokaleCounter[p]++;
                }
            }
        }

        System.out.println("Dein Text hat total " + IntStream.of(vokaleCounter).sum() + " Vokale.");

        for (int q = 0; q < vokaleCounter.length; q++) {
            if (vokaleCounter[q] > 0) {
                System.out.println("Der Buchstabe " + vokale[q] + " kommt " + vokaleCounter[q] + " mal vor.");
            }
        }
    }
}


