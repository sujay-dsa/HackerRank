package factory;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {

		Do_Not_Terminate.forbidExit();

	try{

		Scanner sc=new Scanner(System.in);
		//creating the factory
		FoodFactory foodFactory = new FoodFactory();

		//factory instantiates an object
		Food food = foodFactory.getFood(sc.nextLine());

		
		System.out.println("The factory returned "+food.getClass());
		System.out.println(food.getType());
	}
	catch (Do_Not_Terminate.ExitTrappedException e) {
		System.out.println("Unsuccessful Termination!!");
	}
 }

	}


