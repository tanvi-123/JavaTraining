package com.example.demoonetomany;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Cart {
	@Id
private int cart_id;
private String uname;
@OneToMany(mappedBy = "cart_obj")
private Set<Items>items;

public Cart() {
	
}


public int getCard_id() {
	return cart_id;
}

public void setCard_id(int card_id) {
	this.cart_id = card_id;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public Set<Items> getItems() {
	return items;
}

public void setItems(Set<Items> items) {
	this.items = items;
}

public Cart(int cart_id, String uname) {
	super();
	this.cart_id = cart_id;
	this.uname = uname;
	
}

}
