package com.neil.beans;
import java.util.*;
public class Register {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String age;
	private String email;
	private Map<String,String> errors=null;
	public Register(){
		System.out.println("a new");
		this.name="";
		this.age="";
		this.email="";
		this.errors=new HashMap<String,String>();
	}
	public boolean isValidate(){
		boolean flag=true;
		if(!this.name.matches("\\w{6,15}")){
			flag=false;
			this.name="";
			errors.put("errname", "the name must 6 to 15 length");
		}
		if(!this.age.matches("\\d+")){
			flag=false;
			this.age="";
			errors.put("errage", "the age must be number");
		}
		if(!this.email.matches("\\w+@\\w+\\.\\.?\\w*")){
			flag=false;
			this.email="";
			errors.put("erremail", "the email address is invalid");
		}
		return flag;
	}
	public String getErrorMsg(String key){
		String value=this.errors.get(key);
		return value==null?"":value;
	}
}
