package LeProiect;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Scanner;

import org.junit.Test;

public class FileTest {
	
	@Test
	public void test() {
		FileTest teste = new FileTest();
		File f = new File("persoane.txt");
		assertFalse(teste.fileEmpty(f));
	}

	public boolean fileEmpty(File f){

		boolean empty = true;
		if(f==null)
			return empty=false;
		
		try {
			Scanner scanner;
			scanner = new Scanner(f);
			if(scanner.hasNext())
				empty=false;
			
			}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return empty;
	}

	@Test
	public void test2() {
		FileTest teste = new FileTest();
		File f = null;
		assertFalse(teste.fileEmpty(f));
	}
	
}
