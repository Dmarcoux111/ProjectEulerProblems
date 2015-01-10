/*A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/
public class ProblemFour {
	  public static void main(String[] args) {
		  int currentMax=0;
		  int max=0;
	      for (int i=999; i>=1; i--){
	    	  for (int j=999; j>=1; j--){
	    	  int n=i*j;
	    	  int rev=0;
	    	  while (n>0){
	    		  int dig;
	    		  dig=n%10;
	    		  rev=rev*10+dig;
	    		  n=n/10;
	    		  if (n==rev)
	    		  {
	    			  System.out.println(i+"*"+j+"="+i*j+" is a palindrome.");
	    		      currentMax=i*j;
	    		      if (currentMax>max){
	    		    	  max=currentMax;
	    		      }
	    		  }
	    	  }
	    	  }
	    	  System.out.println("The maximum palindromic number is: "+max);
	      } 
	  }
}
