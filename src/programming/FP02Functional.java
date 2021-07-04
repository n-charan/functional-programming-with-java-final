package programming;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 2, 4, 54, 56, 78, 9, 22);
		int sum = addListFunctional(numbers);
		System.out.println(sum);
	}

	private static int addListFunctional(List<Integer> numbers) {
		return numbers.stream().reduce(0, (x, y) -> x + y);
	}

}
