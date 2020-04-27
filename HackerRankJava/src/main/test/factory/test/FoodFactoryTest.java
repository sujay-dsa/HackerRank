package factory.test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.lang.reflect.InvocationTargetException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import factory.FoodFactory;

public class FoodFactoryTest {
	
	private FoodFactory ff;
	
	@BeforeEach
	public void setup() {
		ff = new FoodFactory();
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Cake","Pizza"})
	public void testNotNull(String order) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		assertNotNull(ff.getFood(order));		
	}
	
	
	@ParameterizedTest
	@ValueSource(strings = {"Cake","Pizza"})
	public void testClassName(String order) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		assertEquals("factory."+order.substring(0, 1).toUpperCase() +order.substring(1),
				ff.getFood(order).getClass().getName());
	}

}
