package com.example.demo.entity;

import javax.persistence.*;


@Entity
public class Registration {
	
	 @Id
	    @Column()
	    private int  mobile ;

    @Column()
    private String username ;

    @Column()
    private String name ;
    
    @Column()
    private String password ;
    
    @Column()
    private String  dateofbirth ;
    
    @Column()
    private String  address ;
    
   

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Registration [ username=" + username + ", name=" + name + ", password=" + password
				+ ", dateofbirth=" + dateofbirth + ", address=" + address + ", mobile=" + mobile + "]";
	}
    
    
	
    

}
