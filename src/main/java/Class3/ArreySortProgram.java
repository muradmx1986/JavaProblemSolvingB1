package Class3;

import java.util.Arrays;
import java.util.Collections;

class ArreySortProgram {
    public static void main(String[] args) {
        Integer[] values = {10, 40, 75, 65, 80, 85, 90};
        Arrays.sort(values, Collections.reverseOrder()); // Sort in descending order

        for (int value : values) {
            System.out.println(value);
        }
    }
}
