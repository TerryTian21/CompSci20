package codes.Lessons;

public class StringL10 {

	public static void main(String[] args) {
		
		String word = "Hello World";
		//strings are not a basic data type because it consists of chars
		//A string really is just an array of chars
		//you should treat a string as an array
		
		System.out.println(word.charAt(0)); //this is just like an index
		//Hello World has 10 indices because of the space so. . .
		System.out.println(word.charAt(5)+"_"); //this is a space
		
		//we can also find index of a char
		System.out.println(word.indexOf('H'));
		
		//takes a section of the string to make a substring
		System.out.println(word.substring(word.indexOf('e'),word.indexOf('r')));
		
		//you can move things around
		
		String newWord = "";
		newWord += word.charAt(word.length()-1);
		newWord += word.substring(0, word.length()-1);
		System.out.println(newWord);
		
		//we can find the askei value of alphabetical letters by casting it
		
		String word1 = "house";
		char[] array = word1.toCharArray();
		//stores the string into an char array
		System.out.println(array[0]);
		
		
	}

}
