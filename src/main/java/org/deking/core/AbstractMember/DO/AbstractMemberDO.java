package org.deking.core.AbstractMember.DO;

import java.math.BigDecimal;

@SuppressWarnings("serial")
public abstract class AbstractMemberDO extends BaseMemberDO {

	private int id;
	private int userGroup;
	private String user;
	private String pass;
	private int level;
	private String realName;
	private String address;
	private String mobile;
	private String email;
	private String securityQuestion;
	private String securityAnswer;
	private String header;
	private BigDecimal accountMoney;
	private BigDecimal accountScore;
	private boolean removed;

	public int getId() {
		return id;
	}

	public AbstractMemberDO setId(int id) {
		this.id = id;
		return this;
	}

	public int getUserGroup() {
		return userGroup;
	}

	public AbstractMemberDO setUserGroup(int userGroup) {
		this.userGroup = userGroup;
		return this;
	}

	public String getUser() {
		return user;
	}

	public AbstractMemberDO setUser(String user) {
		this.user = user;
		return this;
	}

	public String getPass() {
		return pass;
	}

	public AbstractMemberDO setPass(String pass) {
		this.pass = pass;
		return this;
	}

	public int getLevel() {
		return level;
	}

	public AbstractMemberDO setLevel(int level) {
		this.level = level;
		return this;
	}

	public String getRealName() {
		return realName;
	}

	public AbstractMemberDO setRealName(String realName) {
		this.realName = realName;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public AbstractMemberDO setAddress(String address) {
		this.address = address;
		return this;
	}

	public String getMobile() {
		return mobile;
	}

	public AbstractMemberDO setMobile(String mobile) {
		this.mobile = mobile;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public AbstractMemberDO setEmail(String email) {
		this.email = email;
		return this;

	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public AbstractMemberDO setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
		return this;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public AbstractMemberDO setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
		return this;
	}

	public BigDecimal getAccountMoney() {
		return accountMoney;
	}

	public AbstractMemberDO setAccountMoney(BigDecimal accountMoney) {
		this.accountMoney = accountMoney;
		return this;

	}

	public BigDecimal getAccountScore() {
		return accountScore;
	}

	public AbstractMemberDO setAccountScore(BigDecimal accountScore) {
		this.accountScore = accountScore;
		return this;
	}

	public String getHeader() {
		return header;
	}

	public AbstractMemberDO setHeader(String header) {
		this.header = header;
		return this;
	}

	public boolean isRemoved() {
		return removed;
	}

	public AbstractMemberDO setRemoved(boolean removed) {
		this.removed = removed;
		return this;
	}
}