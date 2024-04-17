public class isPrime {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("ans : "+isPrime(n));
    }
    static boolean isPrime(int n){
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
