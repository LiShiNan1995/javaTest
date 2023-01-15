import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TestTest {

    @Test
    public void TestMethod() {
        //初始化需要排序的数组
        int[] array = {9, 2, 11, 7, 12, 5};

        //依次进行选择排序，每次找出最小的元素，放入待排序的序列中
        for (int i = 0; i < array.length; i++) {

            //记录最小元素min和最小元素的数组下标索引minIndex
            int min = array[i];
            int minIndex = i;

            //在未排序的序列中找出最小的元素和对应数组中的位置
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            //交换位置
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        //打印出排序好的序列
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void TestMethod_2() {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello,匿名内部类");
//            }
//        };
        Runnable runnable = () -> System.out.println("Hello,匿名内部类");
        runnable.run();
    }
}