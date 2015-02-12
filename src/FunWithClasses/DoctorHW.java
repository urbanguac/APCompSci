package FunWithClasses;

public class DoctorHW {
    	private String type;
	private String name;
	private boolean isCertified;
	private boolean neatHandwriting;
	private int salary;
	public DoctorHW() {
		this(null, null, true, false, 0);
	}
	public DoctorHW(String t, String n, boolean c, boolean h, int s) {
		type = t;
		name = n;
		isCertified = c;
		neatHandwriting = h;
		salary = s; 
	}
	public DoctorHW(String n) {
		this("Tank/Jungle", n, true, false, 1000);
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public boolean getCertification() {
		return isCertified;
	}
	public boolean getPenmanship() {
		return neatHandwriting;
	}
	public int getSalary() {
		return salary;
	}
}

