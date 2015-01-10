/*
 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number? 
 */
public class ProblemSeven {

	public static void main(String[] args) {
		        int N = 1000000;

		        // initially assume all integers are prime
		        boolean[] isPrime = new boolean[N + 1];
		        for (int i = 2; i <= N; i++) {
		            isPrime[i] = true;
		        }

		        // mark non-primes <= N using Sieve of Erastothenes
		        for (int i = 2; i*i <= N; i++) {

		            // if i is prime, then mark multiples of i as nonprime
		            // suffices to consider mutiples i, i+1, ..., N/i
		            if (isPrime[i]) {
		                for (int j = i; i*j <= N; j++) {
		                    isPrime[i*j] = false;
		                }
		            }
		        }

		        // count primes
		        int primes = 0;
		        outerloop:
		        for (int i = 2; i <= N; i++) {
		            if (isPrime[i]){ primes++;
		            if (primes==10001){
		            System.out.println(i);
		            break outerloop;
		            }
		            }
		        }
		        System.out.println("The number of primes <= " + N + " is " + primes);
		    }
		}

	


