package oopsConcept;

public class Machine {


		int speed = 50;

		void display() {

			System.out.println("The speed of the vehicle is " + speed);
		}

		static class Car extends Machine{

			int speed = 100;

			void display() {

				System.out.println("The speed of car is :" + super.speed);
			}

			public static void main(String[] args) {
			Machine v = new Machine();
				v.display();
				Car c = new Car();
				c.display();

			}

		}
	}



