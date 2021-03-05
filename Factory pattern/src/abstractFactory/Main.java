package abstractFactory;

public class Main {

	public static void main(String[] args) {

		FactoryProducer.getFactory("Color").getColor("Red").fill();
		FactoryProducer.getFactory("Color").getColor("Green").fill();
		FactoryProducer.getFactory("Color").getColor("Blue").fill();
		
		FactoryProducer.getFactory("Shape").getShape("Circle").draw();
		FactoryProducer.getFactory("Shape").getShape("Rectangle").draw();
		FactoryProducer.getFactory("Shape").getShape("Square").draw();
	}

}
