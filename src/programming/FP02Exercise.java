package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Exercise {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
		sumOfSquares(numbers);
		System.out.println("=============================");
		sumOfCubes(numbers);
		System.out.println("=============================");
		sumOfOddNumber(numbers);
		System.out.println("=============================");
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		createListWithCourseLength(courses);
	}

	private static void sumOfSquares(List<Integer> numbers) {
		int sum = numbers.stream()
				.map(number -> number * number)
				.reduce(0, Integer::sum);
		System.out.println("Sum of squares : " + sum);
	}

	private static void sumOfCubes(List<Integer> numbers) {
		int sum = numbers.stream()
				.map(number -> number * number * number)
				.reduce(0, (x, y) -> x + y);
		System.out.println("Sum of cubes : " + sum);
	}

	private static void sumOfOddNumber(List<Integer> numbers) {
		int sum = numbers.stream()
				.filter(number -> number%2!=0)
				.reduce(0, Integer::sum);
		System.out.println("Sum of odd numbers : " + sum);
	}

	private static void createListWithCourseLength(List<String> courses) {
		List<Integer> courseLengths = courses.stream().map(str -> str.length()).collect(Collectors.toList());
		System.out.println(courseLengths);
		
	}

}
