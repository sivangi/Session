package sessionAgain;

public class GasFactory extends AbstractFactory {

	@Override
	public Car getCar(String carType) {
		return null;
	}

	@Override
	Gas getGas(String gas) {

		if (gas == null) {
			return null;
		}

		if (gas.equalsIgnoreCase("REGULAR")) {
			return new Regular();

		} else if (gas.equalsIgnoreCase("PREMIUM")) {
			return new Premium();

		} else if (gas.equalsIgnoreCase("UNLEADED")) {
			return new Unleaded();
		}

		return null;
	}
}