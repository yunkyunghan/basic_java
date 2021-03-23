
public class AccountingApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + valueOfSupply * vatRate;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		System.out.println("Value of supply: " + valueOfSupply);//공급가
		System.out.println("VAT: " + vat);// 부가세
		System.out.println("Total: " + total);//소비가 내야하는 돈 
		
		System.out.println("Expense: " + expense); 
		System.out.println("Income: " + income); //이익
		
		//이익을 5:3:2비율 배분 
		System.out.println("Dividend 1: " + dividend1); 
		System.out.println("Dividend 2: " + dividend2); 	
		System.out.println("Dividend 3: " + dividend3); 
		

	}
 
}
