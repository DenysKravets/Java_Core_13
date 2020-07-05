package ua.lviv.lgs;

public class Person 
{
	private int height;
	private int weight;
	
	Person(int height, int weight)
	{
		super();
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [height=" + height + ", weight=" + weight + "]";
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
