package Capstone;

public class NumbersToWords
{

	public NumbersToWords()
	{
		
	}
	
	public String convertThreeNumbers(String number)
	{
		/*
		 *initialize string variable
		 *call the convertHundreds method and assign the value to the string variable
		 *call the convert tens method and add the value to the string variable
		 *check if the length of the string is greater than one and the character in the tens place is not equal to 1
		 *if true call convertOnes method and add the value to the string 
		 *return the string 
		 */
	}
	
	public String convertHundreds(String number)
	{
		/*
		 * initialize a string variable
		 *check if the length of the string is greater than 2
		 *call find char method
		 *find the character in the hundreds place, assign it to a character variable
		 *call the findOnesAndHundreds method, pass the char variable into the method.
		 *assign the value to the string variable add the word " hundred" after
		 *
		 *
		 */
	}
	
	public String convertTens(String number)
	{
		/*
		 * check if the length of the string is greater than one
		 * call the findChar method. find the character in the tens place and assign the value to a char variable
		 * check if the character is equal to 1. if true, call the findTeens method and pass on the character and the number
		 * return the value
		 * if not call the findTens method and return the value
		 */
	}
	
	public String convertOnes(String number)
	{
		char character = findChar(number,1);
		
		return findOnesAndHundreds(character);
	}
	
	public String findTeens(String number, char character)
	{
		String word = "";
		
		switch(character)
		{
		
			case '0':
				 word = "";
				break;
				
			case '1':
				word = "ten";
				break;
				
			case '2':
				word = "twenty";
				break;
				
			case '3':
				word = "thirty";
				break;
				
			case '4':
				word = "fourty";
				break;
				
			case '5':
				word = "fifty";
				break;
				
			case '6':
				word = "sixty";
				break;
				
			case '7':
				word = "seventy";
				break;
				
			case '8':
				word = "eighty";
				break;
				
			case '9':
				word = "ninety";
				break;
				
				default:
					word = "error";
					break;
		}
		return word;
	}
	
	public String findTens(String number)
	{
		String word = "";
		
		char character = findChar(number, 1);
		
		switch(character)
		{
		
			case '0':
				 word = "";
				break;
				
			case '1':
				word = "one";
				break;
				
			case '2':
				word = "two";
				break;
				
			case '3':
				word = "three";
				break;
				
			case '4':
				word = "four";
				break;
				
			case '5':
				word = "five";
				break;
				
			case '6':
				word = "six";
				break;
				
			case '7':
				word = "seven";
				break;
				
			case '8':
				word = "eight";
				break;
				
			case '9':
				word = "nine";
				break;
					
			default:
				word = "error";
				break;
		}
		return word;
	}
	
	public String findOnesAndHundreds(char character)
	{
		String word = "";
		
		switch(character)
		{
		
		case '0':
			 word = "";
			break;
			
		case '1':
			word = "one";
			break;
			
		case '2':
			word = "two";
			break;
			
		case '3':
			word = "three";
			break;
			
		case '4':
			word = "four";
			break;
			
		case '5':
			word = "five";
			break;
			
		case '6':
			word = "six";
			break;
			
		case '7':
			word = "seven";
			break;
			
		case '8':
			word = "eight";
			break;
			
		case '9':
			word = "nine";
			break;
			
			default:
				word = "error";
				break;		
		}
		
		return word;
		
	}
	
	public char findChar(String number, int digit)
	{
		int numCharacter = number.length();
		
		numCharacter -= digit;
		
		return number.charAt(numCharacter);
		
	}
	
	public boolean decimals(String number)
	{
		if(number.contains("."))
		{
			if(number.charAt(number.length()-2) == '.' || number.charAt(number.length()-1) == '.')
				return true;
		}
		return false;
	}
	
	public String rounding(double number, int place)
	{
		/*
		 * rounds a number three decimal places
		 * converts that number into an integer and cutting off the remaining digits
		 * converts the number into a string, return that string
		 */
	}

}
