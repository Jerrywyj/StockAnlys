package com.stockanlys.entity;

public class UserInfo {

    private Integer userId;

    private String username;

    private String password;

    private String token;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

	public UserInfo(Integer userId, String username, String password, String token)
	{
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.token = token;
	}

	public UserInfo(String username, String password)
	{
		super();
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString()
	{
		return "UserInfo [userId=" + userId + ", username=" + username + ", password=" + password + ", token=" + token
				+ "]";
	}
    
}