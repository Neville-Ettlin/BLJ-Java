import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        try {
        String[] binar = new String[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welche Zahl möchten Sie in Binär umwandeln?");
        int input = scanner.nextInt();

        for (int i = 1; input != 0; i++) {
            int rest = input % 2;
            binar[binar.length - i] = String.valueOf(rest);
            input /= 2;

        }
        String[] binarNoNull = Arrays.stream(binar)
                .filter(e -> e != null)
                .toArray(String[]::new);

        String binarZusammen = String.join("", binarNoNull);
        System.out.println(binarZusammen);
        } catch (InputMismatchException e) {
            System.out.println("Bitte geben Sie eine Zahl ein!");
        } catch (Exception e) {
            System.out.println("Ein Fehler ist aufgetreten!" + e);
        }
    }
}