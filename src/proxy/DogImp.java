package proxy;

import proxy.annon.Seven;
import proxy.imp.AnimalInterface;

public class DogImp implements AnimalInterface {

	@Seven(value = "Lumia")
	private String name;

	private String Property;

	public DogImp() {
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void say() {
		System.out.println("小狗:汪汪汪汪.....");
	}

	@Override
	@Seven(Property = "水陆两栖战士")
	public void setProperty(String Property) {
		this.Property = Property;
	}

	@Override
	public void getProperty() {
		System.out.println(this.name + this.Property);
	}
}
