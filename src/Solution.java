import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
	public int solution(int[] T) {

		int count = 1;

		int initialDayTemperature = T[0];

		for (int index = 1; index < T.length; index++) {
			if (initialDayTemperature >= T[index]) {
				count++;
			} else {
				break;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter array of temperatures. Enter in single line, dividing by space character (' ')");

		String line = scanner.nextLine();

		String[] split = line.split(" ");

		int[] array = new int[split.length];

		for (int index = 0; index < split.length; index++) {
			array[index] = Integer.parseInt(split[index]);
		}

		System.out.println(new Solution().solution(array));
	}
}