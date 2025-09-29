import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (1 == 1) {
            System.out.println("Eingabe Jahr (q = quit): ");
            String jahrInput = scanner.nextLine();
            if (jahrInput.equals("q")) {
                System.exit(1);
            } else {
                int jahr = Integer.parseInt(jahrInput);

                if (jahr % 4 == 0 || jahr % 400 == 0 && (jahr / 100) % 1 == 0) {
                        System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr.");
                } else {
                    System.out.println("Das Jahr " + jahr + " ist kein Schaltjahr.");
                }
            }
        }
    }
}