package factory;

import java.lang.reflect.InvocationTargetException;

public class FoodFactory {

	public Food getFood(String order) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		Food food = (Food) Class.forName("factory."+order).newInstance();
		return food;
		
		}
}
