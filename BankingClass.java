package JavaProgram;

public class BankingClass implements BankingInterface,BankingInterTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankingClass b=new BankingClass();
		b.debitcard();
		b.creditcard();
		b.rewardscard();
		
		BankingClass bt= new BankingClass();
		bt.Mastercard();
		
		
		
		BankingInterface bi= new BankingClass();
		bi.debitcard();
		
		BankingInterTwo bt1= new BankingClass();
		bt1.Mastercard();

	}

	@Override
	public void creditcard() {
		// TODO Auto-generated method stub
		System.out.println("CreditCardDetails");
		
	}

	@Override
	public void debitcard() {
		// TODO Auto-generated method stub
		System.out.println("debitCardDetails");
		
	}

	@Override
	public void rewardscard() {
		// TODO Auto-generated method stub
		System.out.println("rewardsCardDetails");
		
		
	}
	
	public void Mastercard() {
		// TODO Auto-generated method stub
		System.out.println("MastercardDetails");
		
		
	}
	

}
