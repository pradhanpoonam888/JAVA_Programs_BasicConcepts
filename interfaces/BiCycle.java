package interfaces;

public class BiCycle implements Vehicle{
	int candence,gear,speed,brake=0;

	public static void main(String[] args) {
		BiCycle bic=new BiCycle();
		bic.changeCadence(2);
		bic.applyBrakes(3);
		bic.changeGear(5);
		bic.speedUP(90);
		bic.print();
		int[] a = {1,2,3};
	}

	@Override
	public void changeCadence(int newVal) {
		candence=newVal;
		
	}

	@Override
	public void changeGear(int newVal) {
		gear=newVal;
		
	}

	@Override
	public void speedUP(int inc) {
		speed=inc;
		
	}

	@Override
	public void applyBrakes(int dec) {
		brake=dec;
		
	}
	
	public void print() {
		System.out.println("changeCadence : " + candence + "\n"
				+ "changeGear : " + gear + "\n"
				+ "speedUP : "+ speed + "\n"
				+ "applyBrakes : " + brake + "\n");
	}

}
