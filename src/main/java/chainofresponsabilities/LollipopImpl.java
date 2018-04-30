package chainofresponsabilities;

public class LollipopImpl extends CandyMachine {

	private CandyMachine chain;
	private double price = 5;
	
	@Override
	public void setNextChain(CandyMachine nextChain) {
		this.chain = nextChain;
		
	}

	@Override
	public void dispense(ProductsMachine productsMachine) {

		int lollies = CandyMachine.calculateProduct(productsMachine, this.price);
		
		productsMachine.setLollipops(lollies);
		
		if(this.chain != null) { this.chain.dispense(productsMachine);}
	}
}