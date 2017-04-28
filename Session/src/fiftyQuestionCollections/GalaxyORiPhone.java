package fiftyQuestionCollections;

class Phone implements Comparable<Phone> {

	private int pixels;
	private String brand;

	public Phone(int pixels, String brand) {
		this.pixels = pixels;
		this.brand = brand;
	}

	public int getPixels() {
		return pixels;
	}

	public void setPixels(int pixels) {
		this.pixels = pixels;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public int compareTo(Phone phone) {

		if (this.getPixels() > phone.getPixels())
			return 1;
		else if (this.getPixels() < phone.getPixels())
			return -1;
		else
			return 0;
	}
}

public class GalaxyORiPhone {
	public static void main(String[] args) {
		Phone phone1 = new Phone(577, "Galaxy S7");
		Phone phone2 = new Phone(401, "iPhone6");

		if (phone1.compareTo(phone2) > 0) {
			System.out.println(phone1.getBrand() + " is better.");
		} else {
			System.out.println(phone2.getBrand() + " is better.");
		}
	}
}
