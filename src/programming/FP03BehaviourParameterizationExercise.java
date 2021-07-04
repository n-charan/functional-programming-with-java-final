package programming;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP03BehaviourParameterizationExercise {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		List<Integer> squaredNumbers = createNewList(numbers, x -> x * x);
		System.out.println(squaredNumbers);
		
		System.out.println("=================");
		
		List<Integer> cubedNumbers = createNewList(numbers, x -> x * x * x);
		System.out.println(cubedNumbers);
		
		System.out.println("=================");
		
		List<Integer> doubledNumbers = createNewList(numbers, x -> x * 2);
		System.out.println(doubledNumbers);
	}

	private static List<Integer> createNewList(List<Integer> numbers, Function<Integer, Integer> conditionalMapper) {
		return numbers.stream()
				.map(conditionalMapper)
				.collect(Collectors.toList());
	}

}
