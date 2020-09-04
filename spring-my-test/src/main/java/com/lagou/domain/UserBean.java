package com.lagou.domain;

/**
 * desc:
 *
 * @author tengfei wang
 * @version 1.0
 * @date Created in 3/9/2020
 */
public class UserBean {

	private Integer id;

	private String username;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "UserBean{" +
				"id=" + id +
				", username='" + username + '\'' +
				'}';
	}
}
