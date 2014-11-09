public class Account{
	
	private double balance; //instance variable
	
	//constructor
	public Account(double InitialBalance){
		
		// validate that initialBalance is greater than 0.0;
		// if it is not, balance is initialized to the default value 0.0
		if(InitialBalance > 0.0){
			balance = InitialBalance;
		}
	}
	
	//add amount to the account
	public void credit(double amount){
		
		balance += amount;
	}
	
	//return account balance
	public double getBalance(){
		
		return balance;
	}
}