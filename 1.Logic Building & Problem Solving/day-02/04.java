/*
4. Given a positive integer N, print the digits in the number as words.
For example:
N = 231
Result = Two Three One
*/
import java.util.Stack;

class Main{
	public static String getStringForm(int num){
		Stack<String> stk = new Stack<>();
		StringBuffer sb = new StringBuffer();
		while(num != 0){
			switch(num % 10){
				case 0 : stk.push("Zero"); 
					 break;
				
				case 1 : stk.push("One"); 
					 break;
					 
				case 2 : stk.push("Two "); 
					 break;
				
				case 3 : stk.push("Three "); 
					 break;
				
				case 4 : stk.push("Four "); 
					 break;
				
				case 5 : stk.push("Five "); 
					 break;
					 
				case 6 : stk.push("Six "); 
					 break;
				
				case 7 : stk.push("Seven "); 
					 break;
				
				case 8 : stk.push("Eight "); 
					 break;
				
				case 9 : stk.push("Nine "); 
					 break; 
			}
			num = num / 10;
		}
			while(!stk.isEmpty()){
				sb.append(stk.pop() + " ");
			}
			return new String(sb);
	}

	public static void main(String[] args){
		String stringNum = getStringForm(123);
		System.out.println(stringNum);
	}
}
