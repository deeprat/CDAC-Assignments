/*
5. Given a positive integer N, print the number in words.
For example:
N = 5312
Result = Five Thousand Three Hundred Twelve
*/

class ConvertToString{
	
	static final String[] units = {
	"", 
	"One", 
	"Two", 
	"Three", 
	"Four", 
	"Five", 
	"Six", 
	"Seven", 
	"Eight", 
	"Nine", 
	"Ten",
	"Eleven", 
	"Twelve", 
	"Thirteen", 
	"Fourteen", 
	"Fifteen",
	"Sixteen", 
	"Seventeen", 
	"Eighteen", 
	"Nineteen"
	}; 

	static final String[] tens = {
		"", 
		"", 
		"Twenty",
		"Thirty", 
		"Fourty", 
		"Fifty", 
		"Sixty", 
		"Seventy",
		"Eighty", 
		"Ninety"
	}; 

	public static String convert(int num){
		//TODO: improve the formatting
		if(num < 0) return "Minus " + convert(-num); 
		if(num < 20) return units[num] + " "; 
		if(num < 100) return tens[num/10] + units[num%10] + " "; 
		if(num < 1000) return units[num/100] + "Hundred " + convert(num%100); 
		if(num < 10000) return units[num/1000] + "Thousand " + convert(num%1000); 
		else return "";
	}

}

class Main{
	public static void main(String[] args){
		int num = 5399; 
		System.out.println(ConvertToString.convert(num));
	}
}
