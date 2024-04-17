import java.util.Arrays;

public class Question_1 {
//    given n, find all pairs from 1-n.
    public static void main(String[] args) {
        int n = 50;
        findPairs(n);
    }
    static void findPairs(int n){
        boolean[] ans = new boolean[n+1];
        Arrays. fill(ans, true);
        ans[0]=ans[1]=false;
        for(int i=2;i<=n;i++){
            if(ans[i]){
                for(int j=i*i;j<=n;j+=i){
                    ans[j]=false;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(ans[i]){
                System.out.print(i+" ");
            }
        }
    }
}
