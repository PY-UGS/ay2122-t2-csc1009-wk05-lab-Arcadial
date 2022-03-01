package lab5.q1;

import java.util.Date;

public class GeometricObject {

	private String color;
	private boolean isFilled;
	private Date dateCreated;

	public GeometricObject() {
		this.color = "white";
		this.dateCreated = new Date();
	}

	public GeometricObject(String color, boolean isFilled) {
		this.dateCreated = new Date();
		this.color = color;
		this.isFilled = isFilled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + this.dateCreated.toString() + "\ncolor: " + this.color + " and filled: " + this.isFilled;
	}

}
