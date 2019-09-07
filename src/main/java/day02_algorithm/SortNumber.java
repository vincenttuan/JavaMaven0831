package day02_algorithm;

public class SortNumber {

    public static void main(String[] args) {
        int[] nums = {5, 3, 2, 1, 4};
        printNum(nums);
        System.out.println("----------------");
        // 由小到大排序 ?
        selectionSort(nums);
        
        printNum(nums);
    }
    
    public static void selectionSort(int[] nums) {
        for(int count=0;count<nums.length;count++) {
            int min_idx = count;
            for(int i=(count+1);i<nums.length;i++) {
                if(nums[i] < nums[min_idx]) {
                    min_idx = i;
                }
            }
            int min = nums[min_idx];
            nums[min_idx] = nums[count];
            nums[count] = min;
        }
        
        
        /*
        int min_idx = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] < nums[min_idx]) {
                min_idx = i;
            }
        }
        int min = nums[min_idx];
        nums[min_idx] = nums[0];
        nums[0] = min;
        
        min_idx = 1;
        for(int i=2;i<nums.length;i++) {
            if(nums[i] < nums[min_idx]) {
                min_idx = i;
            }
        }
        min = nums[min_idx];
        nums[min_idx] = nums[1];
        nums[1] = min;
        
        min_idx = 2;
        for(int i=3;i<nums.length;i++) {
            if(nums[i] < nums[min_idx]) {
                min_idx = i;
            }
        }
        min = nums[min_idx];
        nums[min_idx] = nums[2];
        nums[2] = min;
        
        min_idx = 3;
        for(int i=4;i<nums.length;i++) {
            if(nums[i] < nums[min_idx]) {
                min_idx = i;
            }
        }
        min = nums[min_idx];
        nums[min_idx] = nums[3];
        nums[3] = min;
        */
    }
    
    private static void bubbleSort(int[] nums) {

        for (int count = 1; count < nums.length; count++) { // 次數
            for (int i = 0; i < nums.length - count; i++) {
                if (nums[i] > nums[i + 1]) {
                    int tmp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmp;
                }
            }
        }

        /*
        if(nums[0] > nums[1]) {
            int tmp = nums[0];
            nums[0] = nums[1];
            nums[1] = tmp;
        }
        if(nums[1] > nums[2]) {
            int tmp = nums[1];
            nums[1] = nums[2];
            nums[2] = tmp;
        }
        if(nums[2] > nums[3]) {
            int tmp = nums[2];
            nums[2] = nums[3];
            nums[3] = tmp;
        }
        if(nums[3] > nums[4]) {
            int tmp = nums[3];
            nums[3] = nums[4];
            nums[4] = tmp;
        }
         */
    }

    private static void printNum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
