/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
insights: http://en.wikipedia.org/wiki/Pythagorean_triple#Generating_a_triple
*/
public class ProblemNine {

	public static void main(String[] args) {
		for (int i=1; i<=500; i++){
			int a=i;
			for (int j=a+1; j<=500; j++){
				int b=j;
				int c=1000-(a+b);
				if (((a*a)+(b*b))==(c*c)){
					int product=a*b*c;
					System.out.println(a+" "+b+" "+c+" "+product);
				}
			}
		}
	}

}
