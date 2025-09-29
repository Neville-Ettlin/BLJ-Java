import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] months =  { "Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember" };


        System.out.println("Zahl des Monats (z.B 1 = Januar): ");
        int nummerMonat = scanner.nextInt();

        if (nummerMonat < 1 || nummerMonat > 12) {
            System.out.println("Diese Zahl korrespondiert zu keinem Monat!");
        } else {
            System.out.println("Monat: " + months[nummerMonat - 1]);
        }
    }
}