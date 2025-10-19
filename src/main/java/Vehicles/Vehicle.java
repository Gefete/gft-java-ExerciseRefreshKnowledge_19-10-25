package Vehicles;

public abstract class Vehicle {
	
	private String mark;
	private String model;
	private String registerCode;
	private boolean ownership;
	
	// - Constructor - 
	protected Vehicle() {
		this.mark = "Desconocido";
		this.model = "Desconocido";
		this.registerCode = "Desconocido";
		this.ownership = false;
	}
	
	// - getter and setters -
	protected String getMark() {
		return mark;
	}

	protected void setMark(String mark) {
		this.mark = mark;
	}

	protected String getModel() {
		return model;
	}

	protected void setModel(String model) {
		this.model = model;
	}

	protected String getRegisterCode() {
		return registerCode;
	}

	protected void setRegisterCode(String registerCode) {
		this.registerCode = registerCode;
	}

	protected boolean isOwnership() {
		return ownership;
	}

	protected void setOwnership(boolean ownership) {
		this.ownership = ownership;
	}
	
	
}
