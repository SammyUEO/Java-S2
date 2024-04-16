import java.util.*;
import java.util.Scanner;

public class HashSetHomework {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("introdu numar de nume: ");
		int Lenght = scan.nextInt();
		scan.nextLine();
		
		System.out.println("nume: ");
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0; i<Lenght; i++) {
			
			String pair = scan.nextLine();
			set.add(pair);
			System.out.println("numar de perechi gasite: " + set.size());
		}
		
		scan.close();

	}

}
