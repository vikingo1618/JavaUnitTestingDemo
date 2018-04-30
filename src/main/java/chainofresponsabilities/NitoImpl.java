package chainofresponsabilities;

public class NitoImpl implements ICandyMachine {
	
	private ICandyMachine chain;
	private double price = 8;

	@Override
	public void setNextChain(ICandyMachine nextChain) {
		this.chain = nextChain;
		
	}

	@Override
	public void dispense(ProductsMachine productsMachine) {
		int nitos= 0;
		double money = productsMachine.getMoney();
		while(money >= this.price) {
			money-= this.price;
			nitos++;
		}
		
		productsMachine.setNitos(nitos);
		productsMachine.setMoney(money);
		
		if(this.chain != null) { this.chain.dispense(productsMachine);}
	}
		
}
