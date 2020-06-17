package com.shinhan.sras.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "USER_TB")
public class User {
	@Id
	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "DEPARTMENT")
	private String department;

	@Column(name = "AUTHORITY")
	private String authority;

	public User() {
	}

	public User(String userId, String password, String userName, String department, String authority) {
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.department = department;
		this.authority = authority;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Objects.equals(getUserId(), user.getUserId()) &&
				Objects.equals(getPassword(), user.getPassword()) &&
				Objects.equals(getUserName(), user.getUserName()) &&
				Objects.equals(getDepartment(), user.getDepartment()) &&
				Objects.equals(getAuthority(), user.getAuthority());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getUserId(), getPassword(), getUserName(), getDepartment(), getAuthority());
	}
}
