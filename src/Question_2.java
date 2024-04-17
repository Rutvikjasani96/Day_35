public class Question_2 {
//    given n, find the smallest prime factor for all the numbers.
    public static void main(String[] args) {
        int n= 25;
        int[] ans = smallestPrimeFactor(n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    static int[] smallestPrimeFactor(int n){
        int spf[] = new int[n+1];
        for(int i=0;i<spf.length;i++){
            spf[i]=i;
        }
        for(int i=2;i*i<spf.length;i++){
            if(spf[i]%i==0){
                for(int j=i*i;j<spf.length;j+=i){
                    spf[j] = Math.min(spf[j],i);
                }
            }
        }
        return spf;
    }
}
