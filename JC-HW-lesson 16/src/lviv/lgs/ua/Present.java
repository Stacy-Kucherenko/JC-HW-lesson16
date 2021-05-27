package lviv.lgs.ua;

public class Present {

	public String name;
	private double weight; 
	private double length;
	private double width;
	
	public Present () {}
	
	
	
	public Present(String name) {
		super();
		this.name = name;
	}



	public Present(double weight, double length, double width) {
		super();
		this.weight = weight;
		this.length = length;
		this.width = width;
	}



	public Present(String name, double weight, double length, double width) {
		super();
		this.name = name;
		this.weight = weight;
		this.length = length;
		this.width = width;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Present other = (Present) obj;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}

public void boughtIn (String shopName, int price) {
	System.out.println("Present bought in " + shopName  + " for " + price + " dollars ");
}

public void presentForPerson (String name) {
	System.out.println("The present for " + name);
}

	@Override
	public String toString() {
		return "Present " + name + ", weight = " + weight + "kg "  + ", length = " + length + "cm " + ", width=" + width + "cm";
	} 
	
	
	
	
	
}
