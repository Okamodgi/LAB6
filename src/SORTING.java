import java.util.Scanner;

public class SORTING {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Длина массива: ");
        int num = in.nextInt();
        int[] sortArr = new int[num];
        System.out.println("Введите числа");
        int k;
        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = in.nextInt();
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < sortArr.length - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    k = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = k;
                }
            }
        }
        for (int i = 1; i < sortArr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (sortArr[j] < sortArr[j - 1]) {
                    int tmp = sortArr[j];
                    sortArr[j] = sortArr[j - 1];
                    sortArr[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(sortArr[i] + " ");
        }
    }
}
