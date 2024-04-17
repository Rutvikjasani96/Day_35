public class Question_3 {
//    Count no. of factors.
    public static void main(String[] args) {
        int n = 360;
        System.out.println("ans : "+countFactor(n));
    }
    static int countFactor(int n){
        int[] spf = Question_2.smallestPrimeFactor(n);
        int ans = 1;
        while(n>1){
            int p = spf[n];
            int count=0;
            while(n%p==0){
                count++;
                n = n / p;
            }
            ans = ans * (count+1);
        }
        return ans;
    }
}
