import java.util.Arrays;
import java.util.Scanner;

public class Main13 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie lang soll die Linie sein?");

        int eingabe = scanner.nextInt();

        String[] array = new String[eingabe + 1];

        for (int i = 0; i <= eingabe; i++) {

            array[i] = " ";
            for (int d = i + 1; i + d <= eingabe; d++) {
                array[i + d] = "*";
            }
            for (int c = 0; i - c != 0; c++) {
                array[c] = "*";
            }
            System.out.println(Arrays.toString(array));
        }

    }
}
