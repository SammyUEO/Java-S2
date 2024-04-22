public class HashSet {

	public static boolean containsAllVowels(String str) {
		
		if ((str.contains("a")||str.contains("A")) &&
				
			(str.contains("e")||str.contains("E")) &&
			
			(str.contains("i")||str.contains("I")) &&
			
			(str.contains("o")||str.contains("O")) &&
			
			(str.contains("u")||str.contains("U"))) 
		{
			System.out.println("true");
			
				return true;
		}
		
		System.out.println("false");
		
		return false;
		
		}

	public static void main(String[] args) 
	{
		
		containsAllVowels("The quick brown fox jumps over the lazy dog");

		containsAllVowels("Hello, World!");
		
	}

}