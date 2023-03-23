package com.pro.TeacherCourseOnetoMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;





@Entity
public class Teacher {
	
	@Id
	int id;
	String name;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn
	List<Course> items;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the items
	 */
	public List<Course> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(List<Course> items) {
		this.items = items;
	}
	
	
	
	
	
	
	
	
	
	
	
	


}
