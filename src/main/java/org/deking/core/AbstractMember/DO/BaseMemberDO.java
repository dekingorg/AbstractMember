package org.deking.core.AbstractMember.DO;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class BaseMemberDO implements Serializable{

	private String province;
	private String city;
	private String createDate;
	private boolean isBan;
	private String createIp;
	private String createDevice;
	private int createReferer;

	public String getProvince() {
		return province;
	}

	public BaseMemberDO setProvince(String province) {
		this.province = province;
		return this;
	}

	public String getCity() {
		return city;
	}

	public BaseMemberDO setCity(String city) {
		this.city = city;
		return this;
	}

	public String getCreateDate() {
		return createDate;
	}

	public BaseMemberDO setCreateDate(String createDate) {
		this.createDate = createDate;
		return this;
	}

	public boolean isBan() {
		return isBan;
	}

	public BaseMemberDO setBan(boolean isBan) {
		this.isBan = isBan;
		return this;
	}

	public String getCreateIp() {
		return createIp;
	}

	public BaseMemberDO setCreateIp(String createIp) {
		this.createIp = createIp;
		return this;
	}

	public String getCreateDevice() {
		return createDevice;
	}

	public BaseMemberDO setCreateDevice(String createDevice) {
		this.createDevice = createDevice;
		return this;
	}

	public int getCreateReferer() {
		return createReferer;
	}

	public BaseMemberDO setCreateReferer(int createReferer) {
		this.createReferer = createReferer;
		return this;
	}

	public static void main(String[] args) {
	}

}