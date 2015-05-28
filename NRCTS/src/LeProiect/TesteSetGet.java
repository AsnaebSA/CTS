package LeProiect;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteSetGet {

	 @Test
	    public void testSetNume() {
	        PersObj pers = new PersObj();
	        pers.setNume("Ion");
	        assertTrue(pers.getNume() == "Ion");
	    }
	 
	    @Test
	    public void testGetPrenume() {
	        PersObj pers1 = new PersObj();
	        pers1.setPrenume("Nelu");
	        assertTrue(pers1.getPrenume() == "Nelu");
	    }
	 
	    @Test
	    public void testGetGen() {
	    	PersObj pers2 = new PersObj();
	        pers2.setGen("masculin");
	        assertTrue(pers2.getGen() == "masculin");
	    }
	    
	     
	    @Test
	    public void testGetVarsta(){
	        PersObj pers = new PersObj();
	        pers.setVarsta(2);
	        assertTrue(pers.getVarsta() == 2);
	    }
	     

	 
	
}
