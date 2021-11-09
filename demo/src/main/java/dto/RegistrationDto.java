package dto;

public class RegistrationDto {

	  private int mobile;

	  private String name;

	  private String username;

	  private String password;


	  private String dataofbirth;

	  private String address;
	  
	  
	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getDataofbirth() {
		return dataofbirth;
	}

	public void setDataofbirth(String dataofbirth) {
		this.dataofbirth = dataofbirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "RegistrationDto [mobile=" + mobile + ", name=" + name + ", username=" + username + ", password="
				+ password + ", dataofbirth=" + dataofbirth + ", address=" + address + "]";
	}

	
	
	
}
