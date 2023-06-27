import java.util.Arrays;

public class Main {

    public static int changeValue(int value) {
        value = 22;
        return value;
    }

    public static int changeValue1(Integer value) {
        value = 22;
        return value;
    }
    public static Integer[] changeValue2(Integer[] value) {
        value = new Integer[]{1, 2};
        return value;
    }
    public static void main(String[] args) {
        int value = 33;
        int newValue = changeValue(22);
        System.out.println(newValue);

        Integer value1 = 33;
        changeValue1(value1);
        System.out.println(value1);

        Integer[] value2 = {3,4};
        changeValue2(value2);
        System.out.println(Arrays.toString(value2));
    }
}