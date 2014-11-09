import java.util.Scanner;

public class AccountTest{
	
	public static void main(String[] args){
		
		//create account objects account1, account2
		Account account1 = new Account(20.0);
		Account account2 = new Account(-6.12);
		
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		double depositAmount;
		
		System.out.print("Enter deposit amount for account1: ");
		depositAmount = input.nextDouble();
		account1.credit(depositAmount);//add to account1 balance
		
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf( "\nadding to account2 balance\n\n", depositAmount );
		account2.credit(depositAmount);//add to account2 balance
		
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
		
	}
}