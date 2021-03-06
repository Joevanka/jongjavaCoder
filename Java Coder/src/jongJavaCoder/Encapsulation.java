package jongJavaCoder;

public class Encapsulation {
	
	public Encapsulation() {
		// TODO Auto-generated constructor stub
	}
	
	public Encapsulation(int id, String name, String address, Double salary) {
		super(); //call super class
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}



	//field //variable //property
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void info() {
		System.out.println("id : " + id);
		System.out.println("name : " + this.name);
		System.out.println("address : " + this.address);
		System.out.println("salary : " + this.salary);
	}
}
