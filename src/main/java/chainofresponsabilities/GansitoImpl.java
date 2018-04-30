package chainofresponsabilities;

public class GansitoImpl implements ICandyMachine{
	
	private ICandyMachine chain;
	private double price = 12;

	@Override
	public void setNextChain(ICandyMachine nextChain) {
		this.chain= nextChain;
		
	}

	@Override
	public void dispense(ProductsMachine productsMachine) {
		
		int gansitos= 0;
		double money = productsMachine.getMoney();
		while(money >= this.price) {
			money-= this.price;
			gansitos++;
		}
		
		productsMachine.setGansitos(gansitos);
		productsMachine.setMoney(money);
		
		if(this.chain != null) { this.chain.dispense(productsMachine);}
	}
	
	
}
