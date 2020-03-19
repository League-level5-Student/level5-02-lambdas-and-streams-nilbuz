package _03_Sorting_With_Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamSorter {
	public static void main(String[] args) {
		Integer[] nums = new Integer[50];
		for(int i = 0; i < nums.length; i++) {
			Random rGen = new Random();
			nums[i] = rGen.nextInt();
		}
		
		//1. Convert the Integer array to Stream object.
		
		Stream<Integer> intStream = Arrays.stream(nums);
		
		//2. Use the sorted method of the stream to sort the numbers.
		
		intStream = intStream.sorted();
		
		
		//3. Use the forEach method with a lambda to print all the elements of the sorted Stream.
		//   They should be in ascending order.
		
		intStream.forEach((Integer x )-> System.out.println(x.toString()));
		
		
		intStream.forEach(new Consumer<Integer>() {
			
			public void accept(Integer a) {
				System.out.println(a.toString());
			}
		});
		

	}
}