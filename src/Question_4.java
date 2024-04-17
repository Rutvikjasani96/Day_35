public class Question_4 {
//    given n, for every number 1-n, get number of factors.
    public static void main(String[] args) {
        int n = 10;
        int[] ans = getAllFact(n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    static int[] getAllFact(int n){
        int[] ans = new int[n+1];
        for(int i = 1; i <= n; i++){
            ans[i] = Question_3.countFactor(i);
        }
        return ans;
    }
}
