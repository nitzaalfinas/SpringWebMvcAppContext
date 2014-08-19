package com.nitza.trycontexta;

public class TutAppContext {
	
	private String name;
	private String pekerjaan;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}
	
	public String printJsonString() {
		return "{ \"Nama\": \""+name +"\", \"Pekerjaan\":\""+pekerjaan+"\" }";
	}
}
