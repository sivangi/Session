package sessionAgain;

public class AbstractFactoryPatternMain {

	public static void main(String[] args) {

		AbstractFactory carFactory = FactoryMaker.getFactory("Car");

		Car toyota = carFactory.getCar("TOYOTA");

		toyota.drive();

		Car honda = carFactory.getCar("HONDA");

		honda.drive();

		Car infiniti = carFactory.getCar("INFINITI");

		infiniti.drive();

		AbstractFactory gasFactory = FactoryMaker.getFactory("GAS");

		Gas regular = gasFactory.getGas("REGULAR");

		regular.fill();

		Gas premium = gasFactory.getGas("PREMIUM");

		premium.fill();

		Gas unleaded = gasFactory.getGas("UNLEADED");

		unleaded.fill();
	}
}
