package strategy;

public class MollarDuck extends Duck{

	public MollarDuck() {
	quackBehaviour = new Quack();
	flyBehaviour = new FlyWithWings();
	}
			
	@Override
	public void display() {
		System.out.println("I am a real mollard duck");
		
	}

}
