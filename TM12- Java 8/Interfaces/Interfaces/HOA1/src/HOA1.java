
interface Vehicle {
	default void message() {
		System.out.println("Inside Vehicle");
	}
}

interface FourWheeler {
	default void message() {
		System.out.println("Inside Fourwheeler");
	}
}

class Car implements Vehicle, FourWheeler {
	@Override
	public void message() {
		Vehicle.super.message();
		System.out.println("message method overriden by Car class");
	}
}

public class HOA1 {

	public static void main(String[] args) {

		Car c = new Car();
		c.message();
	}
}
