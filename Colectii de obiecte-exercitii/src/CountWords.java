import java.util.TreeMap;

public class CountWords {

    public static TreeMap<String, Integer> countWords(String[] words) {
    	
        TreeMap<String, Integer> countWordMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        for (String word : words) 
        {
            countWordMap.put(word, countWordMap.getOrDefault(word, 0) + 1);
        }

        return countWordMap;
    }

	public static void main(String[] args) {
		
    String[] inputArray = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
    
    TreeMap<String, Integer> countWordMap = countWords(inputArray);

    System.out.println(countWordMap);
	}
}