package org.deking.member.pojo;

import java.math.BigDecimal;

import org.json.JSONArray;
import org.deking.member.UserLevelEnum;
@SuppressWarnings("serial")
public abstract class AbstractMember extends SimpleMember {


	private UserLevelEnum level;
	private String realname,address,headerImage;
	private JSONArray securityQuestion; 
	private BigDecimal accountScore;
	private AccountStatusEnum AccountStatus;
	private String referer;
	public UserLevelEnum getLevel() {
		return level;
	}
	public void setLevel(UserLevelEnum level) {
		this.level = level;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHeaderImage() {
		return headerImage;
	}
	public void setHeaderImage(String headerImage) {
		this.headerImage = headerImage;
	}
	public JSONArray getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(JSONArray securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public BigDecimal getAccountScore() {
		return accountScore;
	}
	public void setAccountScore(BigDecimal accountScore) {
		this.accountScore = accountScore;
	}
	public AccountStatusEnum getAccountStatus() {
		return AccountStatus;
	}
	public void setAccountStatus(AccountStatusEnum accountStatus) {
		AccountStatus = accountStatus;
	}
	public String getReferer() {
		return referer;
	}
	public void setReferer(String referer) {
		this.referer = referer;
	}
}