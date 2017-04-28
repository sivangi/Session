package jSON;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonDecodeDemo {

	public static void main(String[] args) throws JSONException, org.json.simple.parser.ParseException {

		JSONParser parser = new JSONParser();
		String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";

		Object obj = parser.parse(s);
		JSONArray array = (JSONArray) obj;

		System.out.println("The 2nd element of array");
		System.out.println(array.get(1));
		System.out.println();

		JSONObject obj2 = (JSONObject) array.get(1);
		System.out.println("Field \"1\"");
		System.out.println(obj2.get("1"));

		s = "{}";
		obj = parser.parse(s);
		System.out.println(obj);

		s = "[5,]";
		obj = parser.parse(s);
		System.out.println(obj);

		s = "[5,,2]";
		obj = parser.parse(s);
		System.out.println(obj);
	}
}