package fiftyQuestionCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;

class Students {
		private int id;
		private String name;

		public Students(int id, String name) {
			this.id = id;
			this.name = name;
			//The this() call in a Constructor invokes 
			//the other Constructor with the corresponding 
			//parameter list within the same Class.

		}

		public String getStudentName() {
			return name;
		}

		public void setStudentName(String name) {
			this.name = name;
		}

		public int getStudentId(int id) {
			return id;
		}

		public String toString() {

			return "Student is  " + name + "  the id is " + id + "";
		}

		//The toString() method returns the string representation of the object.
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Students other = (Students) obj;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

	}

	public class CustomClassMap {

		public static void main(String[] args) {

			Students c1 = new Students(01, "Ashley");
			Students c2 = new Students(02, "Bob");
			Students c3 = new Students(03, "Carla");
			Students c4 = new Students(04, "Dan");
			Students c5 = new Students(05, "Ashley");

			HashMap<Students, Integer> map = new LinkedHashMap<Students, Integer>();
			map.put(c1, 100);
			map.put(c2, 200);
			map.put(c3, 300);
			map.put(c4, 400);
			map.put(c5, 500);

			for (Students key : map.keySet()) {
				System.out.println(key + "  :  " + map.get(key));
			}

		}
	}


