import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Rectangle");
            System.out.println("2. Square Triangle bottom-left");
            System.out.println("3. Square Triangle top-left");
            System.out.println("4. Isosceles Triangle");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;

                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;

                case 3:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;

                case 4:
                    for (int i = 1; i <= 7; i += 2) {
                        for (int j = 3; j >= (i / 2); j--) {
                            System.out.print("   ");
                        }

                        for (int k = 1; k <= i; k++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
            }
        }
    }
}
