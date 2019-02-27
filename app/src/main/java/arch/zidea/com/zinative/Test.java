package arch.zidea.com.zinative;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 1;

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result |= arr[i] << (i << 1);
            System.out.println(arr[i] << (i << 1));

        }

        System.out.println(result);
    }
}
