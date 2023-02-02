import java.util.Scanner;

public class SortCharacters {
	
	public static void main(String[] args) {
		
		System.out.print("Enter any two alphabet..");
		
		Scanner sc = new Scanner(System.in);
		
		char c1 = sc.next().charAt(0);
		char c2 = sc.next().charAt(0);
		
		if(c1>c2) {
			System.out.print(c2 + "," +c1);
		}else {
			System.out.print(c1 + "," +c2);
		}
	}

}
