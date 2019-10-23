package com.webonise.SpringBootRest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ISystem {

	@Id
	private int systemId;
	private String systemName;
	private String systemType;

	public String getSystemType() {
		return systemType;
	}

	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}

	public int getSystemId() {
		return systemId;
	}

	public void setSystemId(int systemId) {
		this.systemId = systemId;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	@Override
	public String toString() {
		return "ISystem [systemId=" + systemId + ", systemName=" + systemName + ", systemType=" + systemType + "]";
	}
}
