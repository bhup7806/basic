
public class TextAccount {

	public static void main(String[] args) {
	 
		
		Account name = new Account();
		
		name.setNumber("2381000100");
		name.setAccounttype("saving Account");
		name.setBalance(2000);
		
		System.out.println("Account no" + name.getNumber());
		System.out.println("Account type" + name.getAccounttype());
		System.out.println("Account balance" + name.getBalance());
		  
		name.deposit(3000);
		name.fundtransfer(500);
		name.paybill(500);
		name.withdrawl(200);
		

	}

}
