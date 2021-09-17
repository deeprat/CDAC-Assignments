/*
 2. Given a positive integer N, check if it is an armstrong number or not.
An armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.
For example:
N = 153
Number of digits in number = 3
Sum of its own digits each raised to the power of the number of digits = (1 x 1 x 1) + (5 x 5 x 5) + (3 x 3 x 3) = 1 + 125 + 27 = 153
153 is armstrong number.*/

class Main{
	public static boolean isArmstrong(int num){
		int sum = 0;
		int number = num; 
		while(num != 0){
			int rem = num % 10;
			sum += rem * rem * rem;
			num = num / 10; 
		}
		return number == sum;
	}

	public static void main(String[] args){
		//int num = 153; //true 
		int num = 15; //false 
		System.out.println(isArmstrong(num));
	}
}
