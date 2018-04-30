package chainofresponsabilities;

import org.junit.Test;

public class CandyMachineTest {
	
	@Test
	public void validateCandyMachineChains() {
		
		CandyMachine chain1 = new GansitoImpl();
		CandyMachine chain2 = new NitoImpl();
		CandyMachine chain3 = new LollipopImpl();
		
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		
		ProductsMachine productsMachine = new ProductsMachine();
		productsMachine.setMoney(1119);
		
		
		chain1.dispense(productsMachine);
		
		System.out.println(String.format("Gansitos: %d", productsMachine.getGansitos()));
		System.out.println(String.format("Nitos: %d", productsMachine.getNitos()));
		System.out.println(String.format("Gansitos: %d", productsMachine.getLollipops()));
		System.out.println(String.format("Money: %f", productsMachine.getMoney()));
	}

}
