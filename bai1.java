import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(arr));
        int min = arr[0];
        int max = arr[n - 1];
        System.out.println("Số nhỏ nhất: " + min);
        System.out.println("Số lớn nhất: " + max);
        System.out.print("Các số chẵn trong mảng: ");
        for (int x : arr) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        System.out.print("Các số lẻ trong mảng: ");
        for (int x : arr) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }
}
