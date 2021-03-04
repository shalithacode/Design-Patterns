
public class ColorFactory {

public static Icolor getColor(String type) {
		
		if(type.equals("Red")) {
			return new Red();
		}
		return null;
		
	}
}
