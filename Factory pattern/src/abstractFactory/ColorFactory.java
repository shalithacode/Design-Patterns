package abstractFactory;


public class ColorFactory extends AbstractFactory{

	@Override
	public Shape getShape(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String type) {

		if (type.equals("Red")) {
			return  new Red();
		} else if (type.equals("Green")) {
			return  new Green();
		} else if (type.equals("Blue")) {
			return  new Blue();
		} else
			return null;
	}

}
