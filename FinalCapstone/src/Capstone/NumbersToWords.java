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
		/*
		 * converts one digit number 
		 * calls the findChar method to find the value of a character in the ones place
		 * call the findOnesAndHundreds method, pass the character from the find Char method into the parameters
		 * return value
		 * 
		 */
	}
	
	public String findTeens(String number, char character)
	{
		/*
		 * call findChar method to find the character in the ones place
		 * depending on that character method will return values from 11 to 19
		 */
	}
	
	public String findTens(char number)
	{
		/*
		 * decodes characters in the tens place.
		 * depending on the character method will return a value from ten to ninety
		 */
	}
	
	public String findOnesAndHundreds(char character)
	{
		/*
		 * decode characters in the ones place, and the hundreds place
		 * since they are pretty much the same
		 * return a string 
		 */
		
	}
	
	public char findChar(String number)
	{
		/*
		 * finds a character in a specified location and returns that character
		 */
	}
	
	public boolean decimals(String number)
	{
		/*
		 * ensures that the decmimal is in the right location
		 * return true or false
		 */
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
