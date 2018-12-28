package pl.koziarz.specificationexample.domain.entity;

import java.util.HashSet;
import java.util.Set;

public class Person {
	private String name;
	private int age;
	private Set<Toy> favouriteToys = new HashSet<>();
	
	public Person(String name, int age, boolean isMarried) {
		super();
		this.name = name;
		this.age = age;
		this.isMarried = isMarried;
	}

	public Person() {
	}
	
	public int getAge() {
		return age;
	}
	
	public Set<Toy> getFavouriteToys() {
		return favouriteToys;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setFavouriteToys(Set<Toy> favouriteToys) {
		this.favouriteToys = favouriteToys;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", favouriteToys=" + favouriteToys + "]";
	}
	
}
