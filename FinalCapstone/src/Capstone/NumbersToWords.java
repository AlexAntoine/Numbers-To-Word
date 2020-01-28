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
		if(number.length() > 2)
		{
			char character = findChar(number, 3);
			
			return findOnesAndHundreds(character) + " hundred ";
		}
		
		return "";
	}
	
	public String convertTens(String number)
	{	
		if(number.length() > 1)
		{
			char character = findChar(number, 2);
			
			if(character == '1')
			{
				return findTeens(number);
				
			}
			else
			{
				return findTens(number, character) + " ";
			}
		}
		
		return " ";
	}
	
	public String convertOnes(String number)
	{
		char character = findChar(number,1);
		
		return findOnesAndHundreds(character);
	}
	
	public String findTens(String number, char character)
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
	
	public String findTeens(String number)
	{
		String word = "";
		
		char character = findChar(number, 1);
		
		switch(character)
		{
		
			case '1':
				word = "eleven";
				break;
				
			case '2':
				word = "twelve";
				break;
				
			case '3':
				word = "thiriteen";
				break;
				
			case '4':
				word = "fourteen";
				break;
				
			case '5':
				word = "fifteen";
				break;
				
			case '6':
				word = "sixteen";
				break;
				
			case '7':
				word = "seventeen";
				break;
				
			case '8':
				word = "eighteen";
				break;
				
			case '9':
				word = "nineteen";
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
		
		number /= Math.pow(10,3);
		
		double tempDouble = (number * Math.pow(10, place));
		
		tempDouble += .5;
		
		int tempInt = (int) tempDouble;
		
		return Integer.toString(tempInt);
	}

}
