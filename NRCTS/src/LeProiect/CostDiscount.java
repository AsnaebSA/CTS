package LeProiect;

import static org.junit.Assert.*;

import org.junit.Test;

public class CostDiscount {

	@Test
	public void testDiscount(){
	Bilet discount= new Bilet();
	double pretdiscount =discount.pretdiscount(20, 30, 0.15);
	assertTrue(pretdiscount==90);

	}}

