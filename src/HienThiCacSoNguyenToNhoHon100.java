public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int n = 2;
        boolean flag = false;
        while (n <= 100) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = true;
                    continue;
                }
            }
            if (flag == false) {
                System.out.println(n);
            } else {
                flag = false;
            }
            n++;
        }
    }
}
