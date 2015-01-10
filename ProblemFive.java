/*2520 is the smallest number that can be divided by each 
of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly 
divisible by all of the numbers from 1 to 20?
http://codereview.stackexchange.com/questions/13086/problem-5-on-project-euler*/
//incomplete...solved mathematically, quite easily however...
import java.util.ArrayList;
import java.util.List;
public class ProblemFive {
	public static void main(String[] args) {
	    List<Integer> greatestPrimeFactors = new ArrayList<Integer>();
	    List<Integer> primeFactors = new ArrayList<Integer>();
	    List<Integer> multipleFactors=new ArrayList<Integer>();
	    for (int j=2; j<=10; j++){
	    	int n=j;
	    for (int i = 2; i <= n; i++) {
	      while (n % i == 0) {
	        primeFactors.add(i);
	        n /= i;
	      }
	    }}
	    System.out.println(primeFactors);
	    int max = Integer.MIN_VALUE;
	    for(int i = 0; i < primeFactors.size(); i++)
	    {
	       int current;
	       current = primeFactors.get(i);
	       if(current > max){
	          max = current;
	          greatestPrimeFactors.add(max);
	       }
	    } 
	    System.out.println(greatestPrimeFactors);
	    for (int i=1; i<primeFactors.size();i++){
	    	int current;
	    	int previous;
	    	current=primeFactors.get(i);
	    	int j=i-1;
	    	previous=primeFactors.get(j);
	    	if (current==previous){
	    		multipleFactors.add(previous);
	    	}
	    }
	    System.out.println(multipleFactors);
	}
}



