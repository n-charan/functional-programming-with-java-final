package programming;

import java.util.List;
import java.util.function.BinaryOperator;

public class FP03FunctionalInterfacesExercise {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		BinaryOperator<Integer> sumFunction = Integer::sum;
		BinaryOperator<Integer> sumFunction2 = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer x, Integer y) {
				return x + y;
			}
			
		};
		
		int sum = numbers.stream()
					.reduce(0, sumFunction);
		System.out.println(sum);
		
		int sum2 = numbers.stream()
				.reduce(0, sumFunction2);
		System.out.println(sum2);
	}

}
