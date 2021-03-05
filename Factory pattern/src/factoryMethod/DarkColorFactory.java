package factoryMethod;

public class DarkColorFactory extends ColorFactory{

	@Override
	public Icolor getColor(String type) {


		if (type.equals("DarkRed")) {
			return new DarkRed();
		} else if (type.equals("DarkGreen")) {
			return new DarkGreen();
		} else if (type.equals("DarkBlue")) {
			return new DarkBlue();
		} else
			return null;

}
}
