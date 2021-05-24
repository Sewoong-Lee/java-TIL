package ex11_guest;

public class pocketDTO {
	private String mcode;
	private String tcode;
	private String tname;
	private String mname;
	
	public pocketDTO() {
		super();
	}

	public pocketDTO(String mcode, String tcode, String mname, String tname) {
		super();
		this.mcode = mcode;
		this.tcode = tcode;
		this.tname = tname;
		this.mname = mname;
	}
	public pocketDTO(String tcode, String mname) {
		super();
		this.tcode = tcode;
		this.mname = mname;
	}
	
	public pocketDTO(String mcode, String tcode, String mname) {
		super();
		this.mcode = mcode;
		this.tcode = tcode;
		this.mname = mname;
	}
//	public pocketDTO(String mcode, String mname) {
//		super();
//		this.mcode = mcode;
//		this.mname = mname;
//	}

	public String getMcode() {
		return mcode;
	}

	public void setMcode(String mcode) {
		this.mcode = mcode;
	}

	public String getTcode() {
		return tcode;
	}

	public void setTcode(String tcode) {
		this.tcode = tcode;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	@Override
	public String toString() {
		return "pocketDTO [mcode=" + mcode + ", tcode=" + tcode + ", tname=" + tname + ", mname=" + mname + "]";
	}


}
