public class Car {
	private String make;
	private String model;
	private int year;

	public Car(String make, String model, int year)

	{
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String setCarMake(String make) {
		this.make = make;
		return make;
	}

	public String getCarMake() {
		return make;
	}

	public String setCarModel(String model) {
		this.model = model;
		return model;
	}

	public String getCarModel()

	{
		return model;
	}

	public int setCarYear(int year) {
		this.year = year;
		return year;
	}

	public int getCarYear() {
		return year;
	}

	public String toString() {
		return "Car make: " + make + "\tCar model: " + model + "\tCar Year:"
				+ year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Car car1 = new Car("BenZ", "C63", 2013);
			Car car2 = new Car("BMW", "M3", 2012);
			Car car3 = new Car("Nissan", "GTR", 2013);

			car1.setCarMake("AMG");
			System.out.println(car1);
			System.out.println(car1.getCarYear());

			car2.setCarMake("M Power");
			System.out.println(car2);
			System.out.println(car2.getCarYear());

			car3.setCarMake("Nismo");
			System.out.println(car3);
			System.out.println(car3.getCarYear());

		}

	}
}
