import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zahl1: ");
        int zahlBenutzer1 = scanner.nextInt();
        System.out.print("Zahl2: ");
        int zahlBenutzer2 = scanner.nextInt();
        int sum;
        sum = zahlBenutzer1 + zahlBenutzer2;

        System.out.println("Summe: " +  sum);
    }
    }
