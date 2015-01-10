/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/
import java.util.ArrayList;
import java.util.List;
import java.math.*;
public class ProblemThree {
  
  public static List<Long> primeFactors(Long number) {
    Long n = number;
    List<Long> factors = new ArrayList<Long>();
    for (long i = 2; i <= n; i++) {
      while (n % i == 0) {
        factors.add(i);
        n /= i;
      }
    }
    return factors;
    
  }
  public static void main(String[] args) {
	BigInteger bigRange;
	Long range;
	bigRange=new BigInteger("600851475143");
	range=bigRange.longValue();
    System.out.println("Primefactors of "+range);
    for (Long Long : primeFactors((long) range)) {
      System.out.println(Long);
    }
  }
} 
