package chainofresponsabilities;

public abstract class CandyMachine {
	
	CandyMachine nextChain;

	abstract void setNextChain(CandyMachine nextChain);
	
	abstract void dispense(ProductsMachine productsMachine);
	
	static int calculateProduct(ProductsMachine productsMachine ,double price){
		int product= 0;
		double money = productsMachine.getMoney();
		while(money >= price) {
			money-= price;
			product++;
		}
		productsMachine.setMoney(money);
		return product;
	}
}
