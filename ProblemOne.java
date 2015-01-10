//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.


public class ProblemOne {

	public static void main(String[] args) {
		int count=0;
		int range=1000;
		for (int i=0; i<range; i++)
		{
			
			if (i%3==0)
			{
			count=count+i;
			}
			else if (i%5==0)
			{
			count=count+i;
			}
		}
		System.out.println("The sum of all the multiples of 3 and 5 below "+range+" is: "+count);
	}

}
