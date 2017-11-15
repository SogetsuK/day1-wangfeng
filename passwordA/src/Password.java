import java.util.Scanner;
public class Password {
	public static void main(String[] args) {
		boolean wrong = true;
		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		while(wrong) {
			Scanner s1 = new Scanner(System.in);
			String num = s1.next();
			Integer i = null;
			try {
				i = Integer.parseInt(num);
			}catch(Exception e) {
				System.out.println("\r" + "ILLEGAL CHARACTER! TRY AGAIN!");
				System.out.print("ENTER YOUR PIN:");
				continue;
			}
			if(i == 12345){
				wrong = false;
				System.out.println("\r" + "PIN ACCEPTED.YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
				break;
			}
			System.out.println("\r" + "INCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN:");
		}
	}
}