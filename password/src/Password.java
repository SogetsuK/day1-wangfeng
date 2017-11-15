import java.util.Scanner;
public class Password {
	public static void main(String[] args) {
		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		System.out.println("\r" + "PIN ACCEPTED.YOU NOW HAVE ACCESS TO YOUR ACCOUNT." + "\r");
		again(num);
	}
	static void again(int a) {
		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		Scanner s1 = new Scanner(System.in);
		System.out.print("ENTER YOUR PIN: ");
		int num = s1.nextInt();
		while(num != a) {
			System.out.println("\r" + "INCORRECT PIN. TRY AGAIN." );
			System.out.print("ENTER YOUR PIN: ");
			Scanner s2 = new Scanner(System.in);
			int num1 = s2.nextInt();
			num = num1;
		}
		System.out.println("\r" + "PIN ACCEPTED.YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}