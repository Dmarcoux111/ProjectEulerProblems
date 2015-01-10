/*
 The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first 
ten natural numbers and the square of the sum is 3025 − 385 = 2640.
Find the difference between the sum of the squares of the first 
one hundred natural numbers and the square of the sum.

insights:
function can be written as ((3n^2+2n)(1-n^2))/12
 */
public class ProblemSix {

	public static void main(String[] args) {
		int n=100;
		int m=n*n;
		int firstTerm=(3*m)+(2*n);
		int secondTerm=(1-m);
		int answer=(firstTerm*secondTerm)/12;
		answer=answer*-1;
		System.out.println(answer);

	}

}
