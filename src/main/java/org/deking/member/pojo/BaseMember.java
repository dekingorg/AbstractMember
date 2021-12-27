package org.deking.member.pojo;

import java.time.LocalDateTime;
import java.util.Date;

@SuppressWarnings("serial")
public abstract class BaseMember extends Location{

	private String createIp,createDevice;
	private LocalDateTime createDate;
	public String getCreateIp() {
		return createIp;
	}
	public void setCreateIp(String createIp) {
		this.createIp = createIp;
	}
	public String getCreateDevice() {
		return createDevice;
	}
	public void setCreateDevice(String createDevice) {
		this.createDevice = createDevice;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
 
	
}