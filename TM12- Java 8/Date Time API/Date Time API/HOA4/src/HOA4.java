import java.time.LocalDate;

public class HOA4 {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date + " is leap year: " + date.isLeapYear());

	}
}
