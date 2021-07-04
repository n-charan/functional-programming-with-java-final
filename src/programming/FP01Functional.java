package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 2, 3, 5, 4, 7, 9, 3, 11, 9);
		//printAllOddNumbersInListFunctional(numbers);
		printCubesOfAllOddNumbers(numbers);

	}
	
	private static void printCubesOfAllOddNumbers(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number%2!=0)
			.map(number -> number * number * number)
			.forEach(System.out::println);
		
	}

	/*
	 * private static void printAllOddNumbersInListFunctional(List<Integer> numbers)
	 * { numbers.stream() .filter(number -> number%2!=0)
	 * .forEach(System.out::println); }
	 */
}
