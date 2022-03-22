import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Số lượng số nguyên tố cần in ra:");
        int numbers = input.nextInt();

        int count = 0;
        int n = 2;

        while (count <= numbers) {
            boolean flag = false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println(n);
                count++;
            } else {
                flag = false;
            }
            n++;
        }
    }
}
