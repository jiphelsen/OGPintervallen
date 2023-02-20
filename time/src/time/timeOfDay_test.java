package time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class timeOfDay_test {
	
	@Test
	void test() {
		constructorTest();
		settersTest();
	}
	void settersTest() {
		hoursSetterTest();
		minutesSettersTest();
	}
	void hoursSetterTest() {
		//regular tests  on functioning
		TimeOfDay time1 = new TimeOfDay(0,0);
		time1.setHours(3);
		assert time1.getHours() == 3;
		time1.setHours(0);
		assert time1.getHours() == 0;
		time1.setHours(23);
		assert time1.getHours() == 23;	
		
		//exception test
		Exception exception1 = assertThrows(Exception.class, () -> time1.setHours(-1));
		assertEquals("Illegal `hours` argument", exception1.getMessage());
		Exception exception2 = assertThrows(Exception.class, () -> time1.setHours(24));
		assertEquals("Illegal `hours` argument", exception2.getMessage());
	}
	void minutesSettersTest() {
		//regular  on functioning
		TimeOfDay time1 = new TimeOfDay(0,0);
		time1.setMinutes(3);
		assert time1.getMinutes() == 3;
		time1.setMinutes(0);
		assert time1.getMinutes() == 0;
		time1.setMinutes(59);
		assert time1.getMinutes() == 59;
		
		//exception test
		Exception exception1 = assertThrows(Exception.class, () -> time1.setMinutes(-1));
		assertEquals("Illegal `minutes` argument", exception1.getMessage());
		Exception exception2 = assertThrows(Exception.class, () -> time1.setMinutes(60));
		assertEquals("Illegal `minutes` argument", exception2.getMessage());
	}
	void constructorTest() {
		// regular test on functioning
		TimeOfDay time1 = new TimeOfDay(0,0);
		assert time1.getHours() == 0;
		assert time1.getMinutes() == 0;
		TimeOfDay time2 = new TimeOfDay(0,12);
		assert time2.getHours() == 0;
		assert time2.getMinutes() == 12;
		TimeOfDay time3 = new TimeOfDay(12,0);
		assert time3.getHours() == 12;
		assert time3.getMinutes() == 0;	
		TimeOfDay time4 = new TimeOfDay(12,12);
		assert time4.getHours() == 12;
		assert time4.getMinutes() == 12;
		TimeOfDay time5 = new TimeOfDay(23,0);
		assert time5.getHours() == 23;
		assert time5.getMinutes() == 0;
		TimeOfDay time6 = new TimeOfDay(0,59);
		assert time6.getHours() == 0;
		assert time6.getMinutes() == 59;
		TimeOfDay time7 = new TimeOfDay(23,59);
		assert time7.getHours() == 23;
		assert time7.getMinutes() == 59;
		
		//exception tests
		//hours exceptions
		Exception exception1 = assertThrows(Exception.class, () -> new TimeOfDay(-1, 0));
		assertEquals("Illegal `hours` argument", exception1.getMessage());
		Exception exception2 = assertThrows(Exception.class, () -> new TimeOfDay(24, 0));
		assertEquals("Illegal `hours` argument", exception2.getMessage());
		//minutes exceptions
		Exception exception3 = assertThrows(Exception.class, () -> new TimeOfDay(0, -1));
		assertEquals("Illegal `minutes` argument", exception3.getMessage());
		Exception exception4 = assertThrows(Exception.class, () -> new TimeOfDay(0, 60));
		assertEquals("Illegal `minutes` argument", exception4.getMessage());
		
	}
}