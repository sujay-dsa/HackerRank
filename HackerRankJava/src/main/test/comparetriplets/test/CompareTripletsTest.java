package comparetriplets.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompareTripletsTest {
	
	
	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		Iterator<Integer> i1 = a.iterator();
		Iterator<Integer> i2 = b.iterator();
		BiFunction<Integer, Integer, Integer> compare = (x1, x2) -> x1 > x2 ? 1 : 0;
		List<Integer> result = Stream.of(
				a.stream().mapToInt(x1 -> i2.hasNext() ? compare.apply(x1, i2.next()) : null).sum(),
				b.stream().mapToInt(x1 -> i1.hasNext() ? compare.apply(x1, i1.next()) : null).sum())
				.collect(Collectors.toList());
		return result;
	}
    
    public static void main(String[] args) {
		List<Integer> a= new ArrayList<Integer>();
		List<Integer> b= new ArrayList<Integer>();
		a.add(4);a.add(2);a.add(3);
		b.add(5);b.add(3);b.add(1);
		
		System.out.println(compareTriplets(a, b));
	}

}
