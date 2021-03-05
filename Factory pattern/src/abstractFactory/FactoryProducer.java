package abstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory) {
		
		if(factory.equals("Shape")) {
			return new ShapeFactory();
		}else if(factory.equals("Color")) {
			return new ColorFactory();
		}
			else
				return null;
	}
}
