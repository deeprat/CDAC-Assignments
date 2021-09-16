/*
9. Find the product of all digit of a positive integer.
	For example:
	Number = 312
	Sum of digits = 6 (3 x 1 x 2)
*/

class Main{
	
	public static int findProductOfDigits(int num){
		int prod = 1; 
		while(num > 0){
			prod *= num % 10; 
			num /= 10;
		}
		return prod;
	}

	public static void main(String[] args){
		int num = 312; 
		System.out.println(findProductOfDigits(num));
	}
}
