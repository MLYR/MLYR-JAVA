import java.util.Arrays;

/**
 * @Author MLYR
 * @Description   数组反转
 * @Date 2023/7/23
 **/
public class ShuZu {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "F", "E", "G", "H"};
        System.out.println("demo1()反转：" + Arrays.toString(demo1(arr)));
        System.out.println("demo2()反转：" + Arrays.toString(demo2(arr)));
        System.out.println("demo3()反转：" + Arrays.toString(demo3(arr)));
    }

    public static String[] demo1(String[] arr) {
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {//i <= j
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static String[] demo2(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public static String[] demo3(String[] arr) {
        int length = arr.length;
        String[] reversedArray = new String[length];

        for (int i = 0; i < length; i++) {
            reversedArray[length - 1 - i] = arr[i];
        }
        // 将反转后的数组拷贝回原数组
        System.arraycopy(reversedArray, 0, arr, 0, length);
        return arr;
    }
}
