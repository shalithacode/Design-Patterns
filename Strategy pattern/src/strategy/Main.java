package strategy;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Start mollard duck");
		System.out.println("-------------------");
		Duck mollard = new MollardDuck();
		mollard.performFly();
		mollard.performQuack();
		
		System.out.println("Start Model duck");
		System.out.println("-------------------");
		Duck model = new ModelDuck();
		
		model.performFly();
		model.performQuack();
		
		model.setFlyBehhaviour(new FlyRocketPower());
		model.setQuackBehaviour(new ModelQuack());
		model.performFly();
		model.performQuack();
	}

}
