package sessionAgain;

public class FactoryMaker {

	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("Car")) {
			return new CarFactory();

		} else if (choice.equalsIgnoreCase("Gas")) {
			return new GasFactory();
		}

		return null;
	}
}
