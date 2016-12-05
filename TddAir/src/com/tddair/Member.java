package com.tddair;

public class Member {
	

	public Member(String username, String email)  {
		username_ = username;
		email_ = email;
	}

	
	public String getUsername_() {
		return username_;
	}

	public void setUsername_(String username_) {
		this.username_ = username_;
	}

	public String getEmail_() {
		return email_;
	}

	public void setEmail_(String email_) {
		this.email_ = email_;
	}



	private String username_ = "";
	private String email_ = "";
}
