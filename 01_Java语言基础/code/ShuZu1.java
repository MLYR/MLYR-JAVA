import java.util.Arrays;

/**
 * @Author MLYR
 * @Description 冒泡排序
 * @Date 2023/7/23
 **/
public class ShuZu1 {
    public static void main(String[] args) {
        int[] arr = {15, -5, 99, -16, 69, 32, -8, 53, 466, 2, 5, 62, 4, 2, 4, 33};
        System.out.println(Arrays.toString(arr));
        //控制循环的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            //循环一次，就会将最大的交换到数组的最后一位，所以循环次数要递减i次
            for (int j = 0; j < arr.length - i - 1; j++) {
                //如果前一个数字大于后一个数字，将它们进行交换
                if (arr[j] > arr[j + 1]) {//>升序排序 <降序排序
                    //交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
