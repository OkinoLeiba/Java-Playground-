package java_playground;

import javax.lang.model.type.NullType;

public class Fibonacci {

            private static final boolean[] memo = null;


            public static long FibMethod(final int n) {
                if(n < 2) {
                    return n;
                }
                else {return FibMethod(n - 1) + FibMethod(n - 2);}
            }


            
            public static long FibNativeMethod(int n) {
                    
                long result = 0;
                  
                        
                while(n > 0){
                result += n;
                n--;
                //n -= 1;
                }
                        
                
                return result;
            }

            public static long FibNativeMethodRecursion(final int n) {
        
                
                long recur_result = 0;
                for(int i = 0; i < n; i++) {
                    recur_result += (i + 1);
                }
                return recur_result;
            }
            

            public static long FibMemo(final int n) {
                final long[] memo;
                if(n < 2){return n;}
                else if(memo[n]==0) {
                    memo[n] = FibMemo(n-1, memo) + FibMemo(n-2, memo);
                }
                else{}
                return memo[n];
            }


            

}