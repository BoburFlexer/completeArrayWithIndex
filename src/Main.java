public class Main {
    public static void main(String[] args) {
        int[] a = {3};
        int[] b = {1};
        int c = sum(a) + sum(b);
        System.out.println(c);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}