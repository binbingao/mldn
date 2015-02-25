package com.member.vo;
import java.util.*;
public class Member {
	private String mids;
	private String pword;
	private String name;
	private String address;
	private String telephone;
	private String zipcode;
	private Date lastdate;
	public String getMids() {
		return mids;
	}
	public void setMids(String mids) {
		this.mids = mids;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Date getLastdate() {
		return lastdate;
	}
	public void setLastdate(Date lastdate) {
		this.lastdate = lastdate;
	}
	public String toString(){
		return mids+" "+pword+" "+name+" "+address+" "+telephone+" "+zipcode+" "+lastdate;
	}
	
}
