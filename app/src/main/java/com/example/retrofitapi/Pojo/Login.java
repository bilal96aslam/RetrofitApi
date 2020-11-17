package com.example.retrofitapi.Pojo;

import com.google.gson.annotations.SerializedName;

public class Login{

	@SerializedName("role")
	private String role;

	@SerializedName("record")
	private Record record;

	@SerializedName("id")
	private String id;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private int status;

	@SerializedName("token")
	private String token;

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return role;
	}

	public void setRecord(Record record){
		this.record = record;
	}

	public Record getRecord(){
		return record;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	public void setToken(String token){
		this.token = token;
	}

	public String getToken(){
		return token;
	}
}