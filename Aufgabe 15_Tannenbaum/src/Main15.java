import java.util.InputMismatchException;
import java.util.Scanner;

public class Main15 {
    static int[] KroneHochArray (int KroneHoch) {

        int[] resultat = new int[KroneHoch+1];

        resultat[0] = 1;
        for (int i = 0; i < KroneHoch; i++) {
            resultat[i+1] = resultat[i] + 2;
        }
        return resultat;
    }


    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Breite des Stammes? ");
            int stammBreit = scanner.nextInt();

            System.out.println("Höhe des Stammes? ");
            int stammHoch = scanner.nextInt();

            System.out.println("Höhe der Krone? ");
            int KroneHoch = scanner.nextInt();

            int y = 0;

            for (int q = 1; q <= KroneHochArray(KroneHoch).length - 1; q++) {
                int l = KroneHochArray(KroneHoch)[KroneHochArray(KroneHoch).length - q];
                for (int i = 2; i <= l / 2; i++) {
                    System.out.print(" ");
                }
                for (int z = 0; z != KroneHochArray(KroneHoch)[y]; z++) {
                    System.out.print("*");
                }
                for (int i = 0; i <= l / 2; i++) {
                    System.out.print(" ");
                }
                System.out.print("\n");
                y++;

            }

            int ls = (KroneHochArray(KroneHoch)[KroneHochArray(KroneHoch).length - 1] - 3) / 3;

            for (int i = 0; i < stammHoch; i++) {
                for (int u = 0; u <= ls + 1; u++) {
                    System.out.print(" ");
                }
                for (int c = 0; c < stammBreit; c++) {
                    System.out.print("*");
                }

                System.out.print("\n");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Bitte geben Sie nur ganze Zahlen ein!");
        } catch (Exception e) {
            System.out.println("Ein Fehler ist aufgetreten!" + e);
        }
    }
}