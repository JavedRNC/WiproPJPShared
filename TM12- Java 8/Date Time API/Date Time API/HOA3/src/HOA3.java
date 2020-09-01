import java.time.LocalDate;
import java.time.Period;

public class HOA3 {
	public static void main(String[] args) {

		LocalDate endDate = LocalDate.of(2025, 9, 20);
		Period period = Period.between(LocalDate.now(), endDate);
		System.out.printf("My experience in Wipro is %d years, %d months, %d days", period.getYears(),
				period.getMonths(), period.getDays());
	}
}
