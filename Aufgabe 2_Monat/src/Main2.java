import java.util.Scanner;

        public class Main2 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Wie viele Tage hat der von Ihnen gewünschte Monat?");
                int tageMonat = scanner.nextInt();

                int stundenMonat;
                int minutenMonat;
                int sekundenMonat;

                stundenMonat = 24 * tageMonat;
                minutenMonat = 60 * stundenMonat;
                sekundenMonat = 60 * minutenMonat;

                System.out.println("Ein Monat mit " + tageMonat + " hat " + sekundenMonat + " Sekunden.");

            }
        }
