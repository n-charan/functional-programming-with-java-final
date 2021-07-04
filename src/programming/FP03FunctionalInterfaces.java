package programming;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03FunctionalInterfaces {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

		Function<Integer, Integer> squareFunction = x -> x * x;

		Consumer<Integer> sysoutConsumer = System.out::println;

		numbers.stream()
			.filter(isEvenPredicate)
			.map(squareFunction)
			.forEach(sysoutConsumer);

		System.out.println("======================");
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				return x % 2 == 0;
			}
		};

		Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer x) {
				return x * x;
			}
		};

		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
			@Override
			public void accept(Integer x) {
				System.out.println(x);
			}
		};

		numbers.stream()
			.filter(isEvenPredicate2)
			.map(squareFunction2)
			.forEach(sysoutConsumer2);
		
		System.out.println("======================");
		
		Supplier<Integer> randomSupplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		System.out.println(randomSupplier.get());
		
		System.out.println("======================");
		
		UnaryOperator<Integer> unaryOperator = x -> 3*x;
		System.out.println(unaryOperator.apply(10));
		
		System.out.println("======================");
		
		BiPredicate<Integer, Integer> biPredicate = (x, y) -> x>y;
		System.out.println(biPredicate.test(10, 3));
		
		System.out.println("======================");
		
		BiFunction<Integer, Integer, Boolean> biFunction = (x, y) -> x>y;
		System.out.println(biFunction.apply(10, 11));

		System.out.println("======================");
		
		BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
			System.out.println(x);
			System.out.println(y);
		};
		biConsumer.accept(1, 2);

	}

}
