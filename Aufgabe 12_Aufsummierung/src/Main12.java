
import java.util.Scanner;

public class Main12 {
    static int[] sumUp (int[] eingabeArrayInt) {
        int[] resultat = new int[eingabeArrayInt.length];
        resultat[0] = eingabeArrayInt[0];
        for (int i = 0; i < eingabeArrayInt.length-1; i++) {
            resultat[i+1] = resultat[i] + eingabeArrayInt[i+1];
        }
        return resultat;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Geben Sie die zu summierenden Ganzzahlen ein, getrennt durch ein Komma:");
            String eingabe = scanner.nextLine();

            String[] eingabeArray = eingabe.split(", ");
            int[] eingabeArrayInt = new int[eingabeArray.length];

            for (int i = 0; i < eingabeArray.length; i++) {
                eingabeArrayInt[i] = Integer.parseInt(eingabeArray[i]);
            }

            System.out.println("Resultat:");

            for (int i = 0; i < eingabeArrayInt.length; i++) {
                System.out.println("[" + i + "]" + "\t->\t" + sumUp(eingabeArrayInt)[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Bitte geben Sie nur Ganzzahlen, getrennt mit Komma ein!");
        }
        catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }



    }
}