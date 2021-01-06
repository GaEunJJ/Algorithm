package algorithm200106;
import java.util.*;

public class codeup1019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		String date[] = input.split("\\.");
		
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);
		
		System.out.printf("%04d.%02d.%02d", year, month, day);
	}

}
