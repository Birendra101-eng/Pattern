import java.util.Scanner;

public class CheckNumberOddorEven {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number ");
		int number = scanner.nextInt();
			if (number % 2 == 0) {
				System.out.print(number + " is event number ");
		
		}else {
			System.out.print(number + " is Odd number ");
		}
	
	}

}
