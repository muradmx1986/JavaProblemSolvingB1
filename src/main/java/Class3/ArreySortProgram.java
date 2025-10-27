package Class3;


import java.lang.reflect.Array;
import java.util.Collections;

public class ArraySortProgram {
    public static void main(String[] args) {
        Integer[] values = {10, 40, 75, 65, 80, 85, 90};
        Array (values, Collections.reverseOrder());

        for (int value : values) {
            System.out.println(value);
        }
    }
}
