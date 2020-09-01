import java.time.LocalDate;

public class HOA1 {
	public static void main(String[] args) {
		System.out.println("Today's date: " + LocalDate.now());
		System.out.println("Date after 10 days: " + LocalDate.now().plusDays(10));

	}
}
