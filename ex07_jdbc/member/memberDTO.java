package ex07_jdbc.member;

import java.util.Date;

public class memberDTO {
	private String userid;
	private String passwd;
	private int birthyear;
	private Date regdate;
	
	
	public memberDTO(String userid, String passwd, int birthyear) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.birthyear = birthyear;
	}

	public memberDTO() {
		super();
	}
	
	public memberDTO(String userid, String passwd, int birthyear, Date regdate) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.birthyear = birthyear;
		this.regdate = regdate;
	}
	public memberDTO(String traid, int qty, String mcod) {
		// TODO Auto-generated constructor stub
	}

	public memberDTO(String mname, String mcode, String tcode) {
		// TODO Auto-generated constructor stub
	}

	

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "memberDTO [userid=" + userid + ", passwd=" + passwd + ", birthyear=" + birthyear + ", regdate="
				+ regdate + "]";
	}
	
	
	
	
}
