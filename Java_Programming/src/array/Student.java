package array;

public class Student {
	
	private String sName;
	private String sAddress;
	private int sRollNo;
	private int sID;
	
	public Student(String sName, String sAddress, int sRollNo, int sID) {
		super();
		this.sName = sName;
		this.sAddress = sAddress;
		this.sRollNo = sRollNo;
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public int getsRollNo() {
		return sRollNo;
	}

	public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}

	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}
	
	
	
	
	

}
