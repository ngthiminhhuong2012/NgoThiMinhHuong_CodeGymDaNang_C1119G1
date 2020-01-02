public class SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 1;
        int n = 100;
        while (count < 20) {
            for (int i = 1; i < n; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                    count++;
                }

            }
        }
        public static boolean isPrime( int n){
            for (int i = 0; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
