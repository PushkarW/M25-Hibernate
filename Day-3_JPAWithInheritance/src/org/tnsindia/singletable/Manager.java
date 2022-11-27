package org.tnsindia.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("MNG")
public class Manager  extends Employee {
	private String detname;

	//
	public String getDeptname() {
		return detname;
	}

	public void setDeptname(String detname) {
		this.detname = detname;
	}
	

}
