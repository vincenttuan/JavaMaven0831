package day02_array;

public class ArrayTest {

    public static void main(String[] args) {
        int[] scores = new int[]{100, 90, 80};
        System.out.println(scores.length); // 陣列長度
        System.out.println(scores[0]);
        scores[1] = 95;
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        int sum = scores[0] + scores[1] + scores[2];
        System.out.println(sum);

    }
}
