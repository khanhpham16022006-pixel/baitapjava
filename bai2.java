import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        System.out.print("Nhập số x: ");
        double x = sc.nextDouble();
        int count = 0;
        for (double num : arr) {
            if (num == x) {
                count++;
            }
        }
        System.out.println("Số " + x + " xuất hiện " + count + " lần trong mảng.");
    }
}
