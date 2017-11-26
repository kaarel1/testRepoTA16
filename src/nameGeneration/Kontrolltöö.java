package nameGeneration;

import java.util.ArrayList;
import java.util.List;

public class Kontrolltöö {

	public static void main(String[] args) {

		Kontrolltöö Kt = new Kontrolltöö();

		String[] animals = { "dinosaurus", "lehm", "koer", "kass", "kana", "diivan" };
		int[] numbers = { 1, 9, 8, 7, 5, 3, 6, 97, 25, 4, 18, 104 };
		System.out.println(Kt.CountD(animals));
		System.out.println(lessThanN(animals));
		System.out.println(getMax(numbers));
		
	}

	public int CountD(String[] strings) {
		int count = 0;
		for (String str : strings) {
			if (str.substring(0, 1).equals("d")) {
				count++;
			}
		}
		return count;
	}

	private static List<String> lessThanN(String[] animals) {
		List<String> result = new ArrayList<>();
		for (String string : animals) {
			if (string.length() < 5) {
				result.add(string);
			}
		}
		return result;
	}

	private static List<Integer> getEvenNums(int[] numbers, boolean even) {

		List<Integer> result = new ArrayList<>();
		for (Integer integer : numbers) {
			if (integer % 2 > 0) {
				result.add(integer);
				{

				}

			}
		
		}
	return result;
	}

	private static Integer getMax(int[] numbers) {
		Integer max = numbers.length;
		for (Integer integer : numbers) {
			if (integer > max) {
				max = integer;
			}
		}
		return max;

	}
	
}
