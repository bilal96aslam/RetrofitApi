package com.example.retrofitapi.Pojo;

import com.google.gson.annotations.SerializedName;

public class Record{

	@SerializedName("image")
	private String image;

	@SerializedName("role")
	private String role;

	@SerializedName("sch_name")
	private String schName;

	@SerializedName("currency_symbol")
	private String currencySymbol;

	@SerializedName("timezone")
	private String timezone;

	@SerializedName("student_id")
	private String studentId;

	@SerializedName("section")
	private String section;

	@SerializedName("language")
	private Language language;

	@SerializedName("date_format")
	private String dateFormat;

	@SerializedName("theme")
	private String theme;

	@SerializedName("id")
	private String id;

	@SerializedName("is_rtl")
	private String isRtl;

	@SerializedName("class")
	private String jsonMemberClass;

	@SerializedName("username")
	private String username;




	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return role;
	}

	public void setSchName(String schName){
		this.schName = schName;
	}

	public String getSchName(){
		return schName;
	}

	public void setCurrencySymbol(String currencySymbol){
		this.currencySymbol = currencySymbol;
	}

	public String getCurrencySymbol(){
		return currencySymbol;
	}

	public void setTimezone(String timezone){
		this.timezone = timezone;
	}

	public String getTimezone(){
		return timezone;
	}

	public void setStudentId(String studentId){
		this.studentId = studentId;
	}

	public String getStudentId(){
		return studentId;
	}

	public void setSection(String section){
		this.section = section;
	}

	public String getSection(){
		return section;
	}

	public void setLanguage(Language language){
		this.language = language;
	}

	public Language getLanguage(){
		return language;
	}

	public void setDateFormat(String dateFormat){
		this.dateFormat = dateFormat;
	}

	public String getDateFormat(){
		return dateFormat;
	}

	public void setTheme(String theme){
		this.theme = theme;
	}

	public String getTheme(){
		return theme;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setIsRtl(String isRtl){
		this.isRtl = isRtl;
	}

	public String getIsRtl(){
		return isRtl;
	}

	public void setJsonMemberClass(String jsonMemberClass){
		this.jsonMemberClass = jsonMemberClass;
	}

	public String getJsonMemberClass(){
		return jsonMemberClass;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}
}