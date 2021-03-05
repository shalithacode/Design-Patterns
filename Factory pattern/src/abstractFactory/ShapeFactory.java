package abstractFactory;

import simpleFactory.Blue;
import simpleFactory.Green;
import simpleFactory.Red;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String type) {

		if (type.equals("Circle")) {
			return new Circle();
		} else if (type.equals("Rectangle")) {
			return new Rectangle();
		} else if (type.equals("Square")) {
			return new Square();
		} else
			return null;
	}

	@Override
	public Color getColor(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
