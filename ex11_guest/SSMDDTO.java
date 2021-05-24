package ex11_guest;

public class SSMDDTO {
	private String saledate;
	private int seq;
	private String Pcode;
	private int qty;
	private int amount;
	private String regdate;
	private String pnaame;


	public SSMDDTO() {
		super();
	}


	public SSMDDTO(String saledate, int seq, String pcode, int qty, int amount, String regdate, String pnaame) {
		super();
		this.saledate = saledate;
		this.seq = seq;
		Pcode = pcode;
		this.qty = qty;
		this.amount = amount;
		this.regdate = regdate;
		this.pnaame = pnaame;
	}


	public String getSaledate() {
		return saledate;
	}


	public void setSaledate(String saledate) {
		this.saledate = saledate;
	}


	public int getSeq() {
		return seq;
	}


	public void setSeq(int seq) {
		this.seq = seq;
	}


	public String getPcode() {
		return Pcode;
	}


	public void setPcode(String pcode) {
		Pcode = pcode;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String getRegdate() {
		return regdate;
	}


	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}


	public String getPnaame() {
		return pnaame;
	}


	public void setPnaame(String pnaame) {
		this.pnaame = pnaame;
	}


	@Override
	public String toString() {
		return "SSMDDTO [saledate=" + saledate + ", seq=" + seq + ", Pcode=" + Pcode + ", qty=" + qty + ", amount="
				+ amount + ", regdate=" + regdate + ", pnaame=" + pnaame + "]";
	}

	
	
}
