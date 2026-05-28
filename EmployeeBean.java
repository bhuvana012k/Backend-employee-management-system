package bhuvi;
import java.io.Serializable;

@SuppressWarnings("serial")
public class EmployeeBean implements Serializable {
	 private String id,name,desg;
	 private int bSal;
	 private float totSal;
	 public EmployeeBean() {}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getbSal() {
		return bSal;
	}
	public void setbSal(int bSal) {
		this.bSal = bSal;
	}
	public float gettotSal() {
		return totSal;
	}
	public void settotSal(float totSal) {
		this.totSal = totSal;
	}	

}

