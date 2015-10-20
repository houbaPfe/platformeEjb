package tn.esprit.entity;

import java.io.Serializable;

import javax.persistence.*;



/**
 * Entity implementation class for Entity: Users
 *
 */
@Entity

public class User implements Serializable {

	@Id
	private int id;
	private String login;
	private String password;
	private String email;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	
	public User(String login, String password, String email) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
   
}
