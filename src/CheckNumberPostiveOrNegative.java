import java.util.Scanner;

public class CheckNumberPostiveOrNegative {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("5");
		System.out.println("Enter any Number");
		int number=sc.nextInt();
		
		if(number>0) {
			System.out.println(number + " is Positive number");	
		}else if (number<0) {
			System.out.println(number + " is Negative number");
		}else {
			System.out.println("Given number is zero");
		}
	}

}
