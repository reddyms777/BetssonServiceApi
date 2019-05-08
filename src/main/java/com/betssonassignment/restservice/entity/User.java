package com.betssonassignment.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class User {

@Id
@GeneratedValue
private int id;
private String username;
private String password;
 private String name;
private String email;



public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getUsername() 
{
	return username;
}


public void setUsername(String username) 
{
this.username = username;
 }

public String getPassword()
{
return password;
}

public void setPassword(String password)
{
this.password = password;
}

public String getName()
{
return name;
}

public void setName(String name)
{
this.name = name;
}

public String getEmail() 
{
return email; }

public void setEmail(String email){
this.email=email;}

 @Override
public String toString(){
return "User{" + "username='" + username + '\'' + ", password='" + password + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + '}'; }
}