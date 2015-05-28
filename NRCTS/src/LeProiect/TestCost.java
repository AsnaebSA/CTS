package LeProiect;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCost {
@Test
public void test(){
Bilet cost= new Bilet();
int rez=cost.costbilet(20, 30);
assertTrue(rez==600);

}}
