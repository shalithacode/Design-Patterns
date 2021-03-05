package simpleFactory;

public class ColorFactory {

	public static Icolor getColor(String type) {

		if (type.equals("Red")) {
			return new Red();
		} else if (type.equals("Green")) {
			return new Green();
		} else if (type.equals("Blue")) {
			return new Blue();
		} else
			return null;

	}
}
