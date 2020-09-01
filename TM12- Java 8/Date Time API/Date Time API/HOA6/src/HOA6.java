import java.time.LocalTime;

public class HOA6 {
	public static void main(String[] args) {

		LocalTime currentTime = LocalTime.now();
		LocalTime timeBefore = LocalTime.now().minusHours(5).minusMinutes(30);

		System.out.println("Current Time: " + currentTime);
		System.out.println("Time before 5 hours and 30 minutes: " + timeBefore);
	}
}
