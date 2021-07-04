package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class F05FunctionalInterfaces {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		
		System.out.println(courses.stream().collect(Collectors.joining(", ")));
		
		System.out.println("FINAL -----> " + courses.stream()
				.peek(System.out::println)
				.filter(course -> course.length()>11)
				.map(String::toUpperCase)
				.peek(System.out::println)
				.findFirst());
		
		List<String> coursesUpperCase = new ArrayList<>();
		for(String course : courses) {
			System.out.println(course);
			if (course.length() > 11) {
				System.out.println(course.toUpperCase());
				coursesUpperCase.add(course.toUpperCase());
			}
		}
		System.out.println("FINAL -----> " + coursesUpperCase.get(0));

	}

}
