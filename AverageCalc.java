import java.util.*;

public class AverageCalc {
    public static int average(int start, int end, int step) {
        // your code
        // int sum = 0;
        if (step == 0) return 0; 
        ArrayList<Integer> arrayList = new ArrayList<>();

        // arrayList.add(start);

        if (step < 0) {
            for (int i = start; i >= end; i+=step) {
            arrayList.add(i);
        }
        return arrayList.get(arrayList.size() / 2);
        }

        for (int i = start; i <= end; i+=step) {
            arrayList.add(i);
        }
        System.err.println(arrayList);
        return arrayList.get(arrayList.size() / 2);
    }
}
