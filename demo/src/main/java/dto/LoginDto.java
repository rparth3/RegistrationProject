package dto;

public class LoginDto {
	Long mobile;
	String password;
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginDto [mobile=" + mobile + ", password=" + password + "]";
	}
	
}
