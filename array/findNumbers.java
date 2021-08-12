public class findNumbers {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(countNumber(num) % 2 == 0) count++;
        }
        return count;
    }

    public static  int countNumber(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return  count;
    }

    public static void main(String[] args) {
        int[] input_1 = {12, 345, 2, 6, 7896}; // 2
        int[] input_2 = {555, 901, 482, 1771}; // 1

        System.out.println("case 1: " + findNumbers(input_1));
        System.out.println("case 2: " + findNumbers(input_2));
    }
}
