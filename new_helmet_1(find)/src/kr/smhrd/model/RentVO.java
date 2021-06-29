package kr.smhrd.model;

public class RentVO {
	private String rentid;
	private String rentdate;
	private String rentplaceid;
	private String returndate;
	private String returnplaceid;
	private String memberid;
	private String helmetid;

	public String getRentid() {
		return rentid;
	}

	public void setRentid(String rentid) {
		this.rentid = rentid;
	}

	public String getRentdate() {
		return rentdate;
	}

	public void setRentdate(String rentdate) {
		this.rentdate = rentdate;
	}

	public String getRentplaceid() {
		return rentplaceid;
	}

	public void setRentplaceid(String rentplaceid) {
		this.rentplaceid = rentplaceid;
	}

	public String getReturndate() {
		return returndate;
	}

	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}

	public String getReturnplaceid() {
		return returnplaceid;
	}

	public void setReturnplaceid(String returnplaceid) {
		this.returnplaceid = returnplaceid;
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getHelmetid() {
		return helmetid;
	}

	public void setHelmetid(String helmetid) {
		this.helmetid = helmetid;
	}

}