import java.time.LocalTime;

public class HOA5 {
	public static void main(String[] args) {

		LocalTime currentTime = LocalTime.now();
		LocalTime TimeAfter25Mins = LocalTime.now().plusMinutes(25);
		System.out.println("Current Time is " + currentTime);
		System.out.println("Time after 25 minutes will be " + TimeAfter25Mins);
	}
}
