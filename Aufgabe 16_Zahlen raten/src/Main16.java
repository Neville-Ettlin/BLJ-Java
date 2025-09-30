import java.lang.Math;
import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stop = "y";
        boolean neuerVersuch = false;

        while (stop.equals("y")) {
            int zahlZufall = (int) (Math.random() * 101);
            neuerVersuch = false;
            System.out.println("Zahl von 0-100: ");

            for (int durchlauf = 1; !neuerVersuch; durchlauf++) {
                String zahlUser = scanner.nextLine();
                int zahlUserInt = Integer.parseInt(zahlUser);

                if (zahlUserInt == zahlZufall) {
                    System.out.println("Die Zahl stimmt! Du hast " + durchlauf + " Versuche benötigt.");
                    System.out.println("Noch einmal spielen? [y/n]");
                    stop = scanner.nextLine();
                    neuerVersuch = true;
                } else if (zahlUserInt > zahlZufall) {
                    System.out.println("Die Zahl ist zu gross! Nächster Versuch:");
                } else if (zahlUserInt < zahlZufall) {
                    System.out.println("Die Zahl ist zu klein! Nächster Versuch:");
                }
            }
        }
    }
}