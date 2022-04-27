class Solution {
    public int countPrimes(int n) {
   if (n <= 2) {
            return 0;
        }
        
        boolean[] primes = new boolean[n];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }
        int sqrt=(int)Math.sqrt(n)+1;
        for (int i = 2; i < sqrt; i++) {
            if (primes[i]) {
                for (int j = i*i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
            }
        }
        
        return count;
    }
}