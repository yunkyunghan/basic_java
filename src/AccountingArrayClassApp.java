class Accounting{
	public  double valueOfSupply;
	public  double vatRate;
	public  double expenseRate;
	
	 void print() {
		System.out.println("Value of supply: " + valueOfSupply);
		System.out.println("VAT: " + getVAT());
		System.out.println("Total: " + getTotal());
		System.out.println("Expense: " + getExpense()); 
		System.out.println("Income: " + getIncome()); 
		System.out.println("Dividend 1: " + getDiviend1()); 
		System.out.println("Dividend 2: " + getDiviend2()); 	
		System.out.println("Dividend 3: " + getDiviend3());
	}

	private  double getDiviend1() {
		return getIncome() * 0.5;
	}
	private  double getDiviend2() {
		return getIncome() * 0.3;
	}
	private  double getDiviend3() {
		return getIncome() * 0.2;
	}

	private  double getIncome() {
		return valueOfSupply - getExpense();
	}

	private  double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private  double getTotal() {
		return valueOfSupply + getVAT();
	}

	private  double getVAT() {
		return valueOfSupply * vatRate;
	}
}

public class AccountingArrayClassApp {
	
	public static void main(String[] args) {
		//instance
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print(); 	
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print(); 
		
		a1.print(); 

	}	
 
}
