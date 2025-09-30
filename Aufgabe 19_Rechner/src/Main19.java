//Kommentare Ignorieren, feature folgen
import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Machen Sie Ihre Rechnung: ");
        String eingabe = scanner.nextLine();
        eingabe = eingabe.replaceAll("\\s+","");

        String[] eingabeSplit = eingabe.split("((?=/|\\*|\\+|-)|(?<=/|\\*|\\+|-))");



        int result = 0;
     //   int i = 0;
    //    for (int p = 0; p < (eingabeSplit.length / 3) + 1; p++ ) {
         //   if (eingabeSplit.length == 3 && p == 1) {
           //     break;
            //}
            switch (eingabeSplit[1]) {
                case "+":
                    result += Integer.parseInt(eingabeSplit[0]) + Integer.parseInt(eingabeSplit[2]);
                    break;
                case "-":
                    result += Integer.parseInt(eingabeSplit[0]) - Integer.parseInt(eingabeSplit[2]);
                    break;
                case "*":
                    result += Integer.parseInt(eingabeSplit[0]) * Integer.parseInt(eingabeSplit[2]);
                    break;
                case "/":
                    result += Integer.parseInt(eingabeSplit[0]) / Integer.parseInt(eingabeSplit[2]);
                    break;
                default:
            }
          //  i += 3;
      //  }
        System.out.println("Das Ergebnis ist: " + result);
    }
}