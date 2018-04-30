package chainofresponsabilities;

public class LollipopImpl implements ICandyMachine {

	private ICandyMachine chain;
	private double price = 5;
	
	@Override
	public void setNextChain(ICandyMachine nextChain) {
		this.chain = nextChain;
		
	}

	@Override
	public void dispense(ProductsMachine productsMachine) {
		int lollipop= 0;
		double money = productsMachine.getMoney();
		while(money >= this.price) {
			money-= this.price;
			lollipop++;
		}
		
		productsMachine.setLollipops(lollipop);
		productsMachine.setMoney(money);
		
		if(this.chain != null) { this.chain.dispense(productsMachine);}
	}
}