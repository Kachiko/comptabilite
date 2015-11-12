package org.personnel.kachiko.comptabilite.model;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="test", eager=true)
public class JsfTestBean {
	
	public JsfTestBean(){
		System.out.println("Managed Bean test lancé");
	}

	public String msg = "test";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
