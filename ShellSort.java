package algorithm;

public class ShellSort {

    public static void shellSort(int[] arr){

        int temp = arr.length;
        //步长
        int len = temp/2;
        int count1 = 0;
        while (len>=1){

            for(int i = len+1;i<temp;i++)
            {
                int j = i-len;
                arr[0] = arr[i];
                while (j>0 && arr[0]<arr[j]){
                    arr[j+len] = arr[j];
                    j-=len;
                    count1++;
                }
                arr[j+len] = arr[0];
            }
            len/=2;
        }
        System.out.println("希尔排序的交换次数："+count1);

    }

    public static void dsort(int[] arr){
        int len = 1;
        int count1 = 0;
        for(int i = len+1;i<arr.length;i++)
        {
            int j = i-len;
            arr[0] = arr[i];
            while (j>0 && arr[0]<arr[j]){
                arr[j+len] = arr[j];
                j-=len;
                count1++;
            }
            arr[j+len] = arr[0];
        }
        System.out.println("直接插入排序的交换次数："+count1);
    }
}
