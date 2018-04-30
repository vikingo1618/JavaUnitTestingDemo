package chainofresponsabilities;

public class GansitoImpl extends CandyMachine{
	
	private CandyMachine chain;
	private double price = 12;

	@Override
	public void setNextChain(CandyMachine nextChain) {
		this.chain= nextChain;
		
	}

	@Override
	public void dispense(ProductsMachine productsMachine) {
		
		int gansitos = CandyMachine.calculateProduct(productsMachine, this.price);
		
		productsMachine.setGansitos(gansitos);

		
		if(this.chain != null) { this.chain.dispense(productsMachine);}
	}
	
	
}
