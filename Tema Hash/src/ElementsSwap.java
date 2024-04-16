import java.util.*;

public class ElementsSwap {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("hello");
		list.add("world");
		
		swapFirstLast(list);
		
	}

	private static void swapFirstLast(ArrayList<String> list) {
		if(list.size() > 1) {
			Collections.swap(list, 1, 0);
			System.out.println(list);
		}
		if(list.size() == 1) {
			System.out.println(list);
		}
		if(list.size() < 1) {
			System.out.println(list);
		}
	}

}
