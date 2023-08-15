import java.util.*;

class Solution{
    public int solution(int n, int[] a, int[] b){
        int answer = 0;
        int start = -1, end = -1;
        if(a == b){
            return 0;
        } else{
            int i=0;
            while(i<n){
                if(a[i]!=b[i]){
                    if(start == -1){
                        start = i;
                    }
                    end = i;
                }
                i = i+1;
            }
            return ((end-start)+1);
        }
    }
}
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0;i<t;i++){
            int n = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int j=0;j<n;j++){
                a[j] = s.nextInt();
            }
            for(int j=0;j<n;j++){
                b[j] = s.nextInt();
            }

            Solution sol = new Solution();
            System.out.println(sol.solution(n, a, b));
        }
    }
}
