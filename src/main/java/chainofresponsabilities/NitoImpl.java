package chainofresponsabilities;

public class NitoImpl extends CandyMachine {
	
	private CandyMachine chain;
	private double price = 8;

	@Override
	public void setNextChain(CandyMachine nextChain) {
		this.chain = nextChain;
		
	}

	@Override
	public void dispense(ProductsMachine productsMachine) {
		int nitos = CandyMachine.calculateProduct(productsMachine, this.price);
		
		productsMachine.setNitos(nitos);
		
		if(this.chain != null) { this.chain.dispense(productsMachine);}
	}
		
}
