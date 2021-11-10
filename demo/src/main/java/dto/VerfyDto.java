package dto;

public class VerfyDto {
	private String session;
	private int otp;
	private Long  mobile;
	
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "VerfyDto [session=" + session + ", otp=" + otp + ", mobile=" + mobile + "]";
	}
	
	
	

}
