package chainofresponsabilities;

public interface ICandyMachine {

	void setNextChain(ICandyMachine nextChain);
	
	void dispense(ProductsMachine productsMachine);
	
	
}
