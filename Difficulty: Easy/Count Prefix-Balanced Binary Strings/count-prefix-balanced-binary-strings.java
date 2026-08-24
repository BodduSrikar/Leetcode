class Solution {
    
    private static final int MOD = 1_000_000_007;

     public static int prefixStrings(int n) {
         if (n == 0) return 1;

             long numerator = 1;
             long denominator = 1;

             // Calculate (2n)! / (n! * n!) by multiplying terms progressively
             for (int i = 1; i <= n; i++) {
                 numerator = (numerator * (n + i)) % MOD;
                 denominator = (denominator * i) % MOD;
             }

             // Catalan = (1 / (n + 1)) * (2n Choose n)
             denominator = (denominator * (n + 1)) % MOD;

             // Result = (numerator * modularInverse(denominator)) % MOD
             return (int) ((numerator * modInverse(denominator, MOD)) % MOD);
         }

         // Fermat's Little Theorem for modular inverse
         private static long modInverse(long base, int mod) {
             return power(base, mod - 2, mod);
         }

         private static long power(long base, long exp, int mod) {
             long res = 1;
             base = base % mod;
             while (exp > 0) {
                 if ((exp & 1) == 1) res = (res * base) % mod;
                 base = (base * base) % mod;
                 exp >>= 1;
             }
             return res;
         }

}