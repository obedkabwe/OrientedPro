package exercises4;

public class test4 {

	public static void main(String[] args) {
		
		
		
		Account account = new Account(5842, "obed", 883.0);
		
		account.withdraw(30.0);
		account.deposit(700.0);
		
		
		System.out.println(account.balance);
		
		
		
		
		
		

	}

}
