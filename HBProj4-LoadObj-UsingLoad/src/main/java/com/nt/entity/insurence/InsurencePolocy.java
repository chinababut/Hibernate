/**
 * 
 */
package com.nt.entity.insurence;


public class InsurencePolocy  {
	
	private long polocyid;
	private String pName;
	private int tenure;
	private String company;
	private String type;
	
	public InsurencePolocy() {
		super();
	}
	public long getPolocyid() {
		return polocyid;
	}
	public void setPolocyid(long polocyid) {
		this.polocyid = polocyid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "InsurencePolocy [polocyid=" + polocyid + ", pName=" + pName + ", tenure=" + tenure + ", company="
				+ company + ", type=" + type + "]";
	}
	
	
	
	

}
