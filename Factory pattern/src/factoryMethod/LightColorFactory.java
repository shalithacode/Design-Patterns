package factoryMethod;


public class LightColorFactory extends ColorFactory{

	@Override
	public Icolor getColor(String type) {
		
		if (type.equals("LightRed")) {
			return new LightRed();
		} else if (type.equals("LightGreen")) {
			return new LightGreen();
		} else if (type.equals("LightBlue")) {
			return new LightBlue();
		} else
			return null;
	}

}
