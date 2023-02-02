import java.util.Scanner;

public class GivenCharIsAlphabetOrNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter anything.. ");
		char char1 = scanner.next().charAt(0);
		
		if(Character.isAlphabetic(char1)) {
			System.out.println(char1 +  " is Alphabet ");
		}else if(Character.isDigit(char1)) {
			System.out.println(char1 +  " is digit ");
		}else {
			System.out.println(char1 +  " is special charcter ");
		}
	}

}
