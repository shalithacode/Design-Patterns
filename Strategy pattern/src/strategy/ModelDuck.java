package strategy;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		quackBehaviour = new ModelQuack();
		flyBehaviour = new FlyNoway();
		}
			
	@Override
	public void display() {
		System.out.println("I am a model duck");
		
	}

}
