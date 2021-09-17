/*
3. Find the count of a digit in a given positive integer.
For example:
Number = 12123
Digit = 1
Count of digit 1 in 12123 = 2 (as 1 appears twice in the number)
*/
class Main{
	public static int countOccurance(int num, int checkNum){
		int count = 0; 
		while(num != 0){
			int rem = num % 10; 
			if(rem == checkNum) count ++; 
			num = num / 10;
		}
		return count;
	}

	public static void main(String[] args){
		//int num = 10; false
		int num = 123123;
		int checkNum = 1;
		int count = countOccurance(num, checkNum);
		System.out.println(count);
	}
}


