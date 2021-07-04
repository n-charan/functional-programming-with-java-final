package programming;

import java.util.List;

public class FP01Exercise {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		printAllCourses(courses);
		System.out.println("=============================");
		printCoursesContainingSpring(courses);
		System.out.println("=============================");
		printCoursesWithAtleast4letters(courses);
		System.out.println("=============================");
		printCourseCharacterLength(courses);
	}

	private static void printAllCourses(List<String> courses) {
		System.out.println("Printing all courses");
		courses.stream().forEach(System.out::println);
	}

	private static void printCoursesContainingSpring(List<String> courses) {
		System.out.println("Printing courses containing spring");
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
	}

	private static void printCoursesWithAtleast4letters(List<String> courses) {
		System.out.println("Printing courses with atleast 4 letters");
		courses.stream().filter(course -> course.length()>=4).forEach(System.out::println);
	}
	
	private static void printCourseCharacterLength(List<String> courses) {
		System.out.println("Printing character length of courses");
		courses.stream().map(course -> course.length()).forEach(System.out::println);
	}

}
