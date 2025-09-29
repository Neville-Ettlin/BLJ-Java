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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die zu summierenden Ganzzahlen ein, getrennt durch:");
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





    }
}