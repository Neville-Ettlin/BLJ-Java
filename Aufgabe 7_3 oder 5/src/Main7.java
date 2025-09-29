
public class Main7 {
    public static void main(String[] args) {
        for (int i = 0; i != 31;  i++) {
            if (i % 3 == 0 | i % 5 == 0) {
                System.out.print(i);
                if (i != 30) {
                    System.out.print(", ");
                }
            }
        }
    }
}