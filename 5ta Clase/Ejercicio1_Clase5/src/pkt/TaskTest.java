package pkt;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskTest {
	
	@Test
	public void verificar(){
	Task t= new Task();
	assertTrue(t.getNum() == 1);
	}

}
