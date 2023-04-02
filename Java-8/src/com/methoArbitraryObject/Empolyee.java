package com.methoArbitraryObject;

public class Empolyee {
	int id;
	String name;

	public Empolyee() {
		// TODO Auto-generated constructor stub
	}

	public Empolyee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String msg(String name) {
		return name.toUpperCase();
	}

	public String eng(String name) {
		return name.toLowerCase();
	}

	@Override
	public String toString() {
		return "Empolyee [id=" + id + ", name=" + name + "]";
	}

}
