import java.util.Scanner;

public class Main {

    //Erstellt ein Array in welchem alle Zahlen zwischen Zahl1 und Zahl2 sind.
    static int[] zahlenVonErsteBisZweite (int zahl1, int zahl2) {
        int[] zahlenVonErsteBisZweite_Array = new int[zahl2 - zahl1 + 1];

        int p = 0;
        for (int i = zahl1; i <= zahl2; i++) {
            zahlenVonErsteBisZweite_Array[p] = i;
            p++;
        }
        return zahlenVonErsteBisZweite_Array;
    }

    //Erstellt ein Array in welchem die Quersummen aller Zahlen zwischen Zahl1 und Zahl2 sind.
    static int[] berechneQuersumme(int[] zahlenVonErsteBisZweite, int zahl1, int zahl2) {

        int[] quersummenZahlenVonErsteBisZweite_Array = new int[zahlenVonErsteBisZweite.length];
        for (int i = 0; i < zahlenVonErsteBisZweite.length; i++) {
             int zahl = zahlenVonErsteBisZweite(zahl1, zahl2)[i];
             int quersumme = 0;
                while (zahl != 0) {
                    quersumme = quersumme + (zahl % 10);
                    zahl = zahl / 10;
                }
            quersummenZahlenVonErsteBisZweite_Array[i] = quersumme;
        }
        return quersummenZahlenVonErsteBisZweite_Array;
    }


    static int[] zahlDurchQuersumme (int[] zahlenVonErsteBisZweite, int[] berechneQuersumme, int zahl1, int zahl2) {
        int[] zahlDurchQuersumme_Array = new int[zahlenVonErsteBisZweite.length];

        for (int i = 0; i < zahlenVonErsteBisZweite.length; i++) {
            int zahl =  zahlenVonErsteBisZweite(zahl1, zahl2)[i]; //zahl = Position i in Array zahlenVonErsteBisZweite
            int quersumme = berechneQuersumme(zahlenVonErsteBisZweite(zahl1, zahl2), zahl1, zahl2)[i]; //quersumme = Position i in Array berechneQuersumme
            if (zahl % quersumme == 0) {
                zahlDurchQuersumme_Array[i] = zahl / quersumme;
            } else {
                zahlDurchQuersumme_Array[i] = -1;

            }
        }
        return zahlDurchQuersumme_Array;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl1: ");
        int zahl1 = scanner.nextInt();

        System.out.println("Zahl2: ");
        int zahl2 = scanner.nextInt();

        System.out.println("Zahl, Quersumme, Zahl/Quersumme");
        for (int i = 0; i <= zahlenVonErsteBisZweite(zahl1, zahl2).length -1; i++) {
            if (zahlDurchQuersumme(zahlenVonErsteBisZweite(zahl1, zahl2), berechneQuersumme(zahlenVonErsteBisZweite(zahl1, zahl2), zahl1, zahl2), zahl1, zahl2)[i] != -1) {
                System.out.print(zahlenVonErsteBisZweite(zahl1, zahl2)[i] + ", ");
                System.out.print(berechneQuersumme(zahlenVonErsteBisZweite(zahl1, zahl2), zahl1, zahl2)[i] + ", ");
                System.out.print(zahlDurchQuersumme(zahlenVonErsteBisZweite(zahl1, zahl2), berechneQuersumme(zahlenVonErsteBisZweite(zahl1, zahl2), zahl1, zahl2), zahl1, zahl2)[i]);
                System.out.println(" ");
            }
        }
    }}