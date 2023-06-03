package com.ty.person;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pancard {
	@Id
	private int pid;
	private String pname;
	private String paddress;
	private long pphno;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public long getPphno() {
		return pphno;
	}
	public void setPphno(long pphno) {
		this.pphno = pphno;
	}
	
}
