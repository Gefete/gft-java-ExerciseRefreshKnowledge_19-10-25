package Vehicles;

public class Car extends Vehicle{
	
	private int wheels;
	
	public Car() {
	}

	protected int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public void setMark(String mark) {
		// TODO Auto-generated method stub
		super.setMark(mark);
	}

	@Override
	public void setModel(String model) {
		// TODO Auto-generated method stub
		super.setModel(model);
	}

	@Override
	public void setRegisterCode(String registerCode) {
		// TODO Auto-generated method stub
		super.setRegisterCode(registerCode);
	}

	@Override
	public void setOwnership(boolean ownership) {
		// TODO Auto-generated method stub
		super.setOwnership(ownership);
	}

	public void mostrarInfo() {
		System.out.println( 
				"\nMarca:" + super.getMark() +
				"\nModelo:" + super.getModel() +
				"\nMatricula:" + super.getRegisterCode() +
				"\nRuedas:" + this.getWheels() +
				"\nEn propiedad:" + super.isOwnership()
				);
	}
	
}
