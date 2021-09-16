/*	6. Find the first digit in a positive integer.
	For example:
	Number = 32
	First Digit = 3
 *
 * */

class Main{

	public static int findFirstNum(int num){
		int prev = 0; 
		while(num > 0){
			prev = num; 
			num = num / 10;
		}
		return prev;
	}
	
	public static void main(String[] args){
		int num = 32; 
		System.out.println(findFirstNum(num));
	}
}
