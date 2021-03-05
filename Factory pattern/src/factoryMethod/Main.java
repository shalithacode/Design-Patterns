package factoryMethod;

public class Main {

	public static void main(String[] args) {
		System.out.println("................Dark Colors................");

		ColorFactory dark_red = new DarkColorFactory();
		dark_red.getColor("DarkRed").fill();
		
		ColorFactory dark_green = new DarkColorFactory();
		dark_green.getColor("DarkGreen").fill();
		
		ColorFactory dark_blue = new DarkColorFactory();
		dark_blue.getColor("DarkBlue").fill();
		
		System.out.println("................Light Colors................");
		
		ColorFactory light_red = new LightColorFactory();
		light_red.getColor("LightRed").fill();
		
		ColorFactory light_green = new LightColorFactory();
		light_green.getColor("LightGreen").fill();
		
		ColorFactory light_blue = new LightColorFactory();
		light_blue.getColor("LightBlue").fill();
		
		
	}

}
