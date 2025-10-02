import java.util.*;


public class Main {

    static int[][] memoryLsg; //2d Array Int Lösungen
    static int[] inputArray; //1d Array Int Eingabe
    static Integer[] memoryLsg1d; //1d Array Int Lösungen
    static char[][] memorydisplay;
    static char[][] memoryLsgChar;

    static Integer[] zufallsZahlen1dArrayMeth(){
        int n = 8;
        List<Integer> zufallsZahlenArrayList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            zufallsZahlenArrayList.add(i);
            zufallsZahlenArrayList.add(i);
        }
        Collections.shuffle(zufallsZahlenArrayList);

        Integer[] zufallsZahlenArray = zufallsZahlenArrayList.toArray(new Integer[0]);

        return zufallsZahlenArray;
    }

    static int[][] zufallsZahlen1dZu2dArrayMeth() {
        Integer[] zufallsZahlenArray = memoryLsg1d;
        int[][] zufallsZahlenArrayDoppelt = new int[4][4];
        int i = 0;

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                zufallsZahlenArrayDoppelt[r][c] = zufallsZahlenArray[i];
                i++;
            }
        }
        return zufallsZahlenArrayDoppelt;
    }

    static char[][] zufallsZahlenArrayZuCharArrayMeth() {
        char[][] CharArrayAufgedeckt = new char[4][4];

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                switch (memoryLsg[r][c]) {
                    case 1:
                        CharArrayAufgedeckt[r][c] = '#';
                        break;
                    case 2:
                        CharArrayAufgedeckt[r][c] = '♦';
                        break;
                    case 3:
                        CharArrayAufgedeckt[r][c] = '☺';
                        break;
                    case 4:
                        CharArrayAufgedeckt[r][c] = '♥';
                        break;
                    case 5:
                        CharArrayAufgedeckt[r][c] = '♣';
                        break;
                    case 6:
                        CharArrayAufgedeckt[r][c] = '♫';
                        break;
                    case 7:
                        CharArrayAufgedeckt[r][c] = '☼';
                        break;
                    case 8:
                        CharArrayAufgedeckt[r][c] = '©';
                        break;
                    default:
                        System.out.println("Es ist ein Fehler aufgetreten!");
                        break;
                }
            }
        }
     return CharArrayAufgedeckt;
    }

    static char[][] initialCharArrayAnzeigenMeth() {
        char[][] CharArrayAufgedeckt = new char[4][4];
        for (char[] row : CharArrayAufgedeckt) {
            Arrays.fill(row, '?');
        }
        return CharArrayAufgedeckt;
    }

     static boolean checkIdentisch(String input) {
            boolean checkIdentisch = false;
             for (int i = 0; i < memorydisplay.length; i++) {
                 for (int j = 0; j < memorydisplay[i].length; j++) {
                     if (memorydisplay[i][j] != ' ' && memorydisplay[i][j] != '?') {
                         memorydisplay[i][j] = '?';
                     }
                 }
             }
             if (memorydisplay[inputArray[0]][inputArray[1]] == ' ' || memorydisplay[inputArray[2]][inputArray[3]] == ' ') {
                 System.out.println("Eines der beiden Karten ist bereits aufgedeckt!");
                 return false;
             }

            if (memoryLsg[inputArray[0]][inputArray[1]] == memoryLsg[inputArray[2]][inputArray[3]]) {
                memorydisplay[inputArray[0]][inputArray[1]] = ' ';
                memorydisplay[inputArray[2]][inputArray[3]] = ' ';
                checkIdentisch = true;

            } else {
                memorydisplay[inputArray[0]][inputArray[1]] = memoryLsgChar[inputArray[0]][inputArray[1]];
                memorydisplay[inputArray[2]][inputArray[3]] = memoryLsgChar[inputArray[2]][inputArray[3]];
            }
            return checkIdentisch;
    }

    static int[] inputStringAufteilungArrayMeth(String input) {

        input = input.replaceAll(" ", "-");
        String[] inputSplit = input.split("-");

        int[] inputStringZuIntArray = Arrays.stream(inputSplit)
                .mapToInt(Integer::parseInt)
                .toArray();

        if (inputStringZuIntArray[0] == inputStringZuIntArray[2] && inputStringZuIntArray[1] == inputStringZuIntArray[3]) {
            System.out.println("Ungültige Eingabe! 2x die gleiche Position.");
            inputStringZuIntArray[1] = 100;
            return new int[4];

        }

        for (int i = 0; i < inputStringZuIntArray.length; i++) {
            inputStringZuIntArray[i]--;
        }
        return inputStringZuIntArray;
    }


    public static void main(String[] args) {
        final String BOLD = "\u001B[1m";
        final String RESET = "\u001B[0m";
        Scanner scanner = new Scanner(System.in);

        memoryLsg1d = zufallsZahlen1dArrayMeth();
        memoryLsg = zufallsZahlen1dZu2dArrayMeth();
        memoryLsgChar = zufallsZahlenArrayZuCharArrayMeth();
        memorydisplay = initialCharArrayAnzeigenMeth();


        int versuche = 0;
        int endCounter = 0;
        for (int i = 0; endCounter < 8; i++) {

           //System.out.println(Arrays.deepToString(memoryLsgChar).replace("], ", "\n").replace("[[", "").replace("]]", "").replace("[", "").replace(",", "\t"));

            System.out.print("\t");
            for (int j = 0; j < 4; j++) {
                System.out.print(BOLD + (j + 1) + "\t" + RESET);
            }   System.out.println();

            for (int k = 0; k < 4; k++) {
                System.out.print(BOLD + (k + 1) + "\t" + RESET);
                for (int j = 0; j < 4; j++) {
                    System.out.print(memorydisplay[k][j] + "\t");
                }   System.out.println();
            }

            String input = scanner.nextLine();
            inputArray = inputStringAufteilungArrayMeth(input);

            versuche++;
            if (inputArray[1] != inputArray[3] && inputArray[0] != inputArray[2]) {
                if (checkIdentisch(input)) {
                    endCounter++;
                    System.out.println("Treffer\n");
                } else {
                    System.out.println("Verfehlt\n");
                }
            }
        }
        System.out.println("Gratulation! ALle Karten sind Aufgedeckt!");
        System.out.println("Sie benötigten " + versuche + " Versuche!");
        System.out.println("Testing: Samuel Leon Ming on GitHub [samuelm203]");

    }
}