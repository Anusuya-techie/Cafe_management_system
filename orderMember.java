

public class orderMember {
 private String uname,foodname,quantity,address;

public orderMember(String uname, String foodname, String quantity, String address) {
	super();
	this.uname = uname;//instance variable
	this.foodname = foodname;
	this.quantity = quantity;
	this.address = address;
	//this.mobile=mobile;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getFoodname() {
	return foodname;
}

public void setFoodname(String foodname) {
	this.foodname = foodname;
}

public String getQuantity() {
	return quantity;
}

public void setQuantity(String quantity) {
	this.quantity = quantity;
}

public String getAddress()
{ 
	return address;
}
 
 public void setAddress( String address) 
 { 
	 this.address = address;
}
 
/*
 * public String getMobile() { return mobile; }
 * 
 * public void setMobile(String mobile) { this.mobile = mobile; }
 */
 
}
