package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Meal {
	@Id
	int meal_id;
	String meal_name;
	String meal_type;
	public int getMeal_id() {
		return meal_id;
	}
	public void setMeal_id(int meal_id) {
		this.meal_id = meal_id;
	}
	public String getMeal_name() {
		return meal_name;
	}
	public void setMeal_name(String meal_name) {
		this.meal_name = meal_name;
	}
	public String getMeal_type() {
		return meal_type;
	}
	public void setMeal_type(String meal_type) {
		this.meal_type = meal_type;
	}
	
	

}
