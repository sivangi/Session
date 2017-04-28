package sessionAgain;

public class CarFactory extends AbstractFactory {

	@Override
	Car getCar(String car) {

		if (car == null) {
			return null;
		}

		if (car.equalsIgnoreCase("TOYOTA")) {
			return new Toyota();

		} else if (car.equalsIgnoreCase("HONDA")) {
			return new Honda();

		} else if (car.equalsIgnoreCase("INFINITI")) {
			return new Infiniti();
		}

		return null;
	}

	@Override
	Gas getGas(String gas) {
		// TODO Auto-generated method stub
		return null;
	}
}
