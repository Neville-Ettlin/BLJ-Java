import java.util.*;

public class test {

    static Integer[] zufallsZahlen1dArrayMeth(){
        int n = 8;
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            arrayList.add(i);
            arrayList.add(i);
        }
        Collections.shuffle(arrayList);

        Integer[] array = arrayList.toArray(new Integer[0]);

        return array;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(zufallsZahlen1dArrayMeth()));
    }
}