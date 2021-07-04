package programming;

import java.util.stream.LongStream;

public class F05Parallelization {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(LongStream.range(0, 1000000000).sum());
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken : " + (endTime - startTime));
		
		long startTime1 = System.currentTimeMillis();
		System.out.println(LongStream.range(0, 1000000000).parallel().sum());
		long endTime1 = System.currentTimeMillis();
		System.out.println("Time taken : " + (endTime1 - startTime1));
	}

}
