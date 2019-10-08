package com.category.product.models;
import javax.persistence.*;
import java.sql.Blob;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private int id ;
	private String name;
	private String description;
	//private Blob image;
	private long price;
	 
	 @Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price="
				+ price + " ]";
	}
	 @ManyToOne(fetch=FetchType.LAZY)
	private Category category; 

	public Product() {
		
	}
	public Product(int id, String name, String description, /*Blob image,*/ long price, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		//this.image = image;
		this.price = price;
		this.category = category;
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	/*public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}*/
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

}
