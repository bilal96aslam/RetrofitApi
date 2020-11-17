package com.example.retrofitapi.Pojo;

import com.google.gson.annotations.SerializedName;

public class Language{

	@SerializedName("lang_id")
	private String langId;

	@SerializedName("language")
	private String language;

	public void setLangId(String langId){
		this.langId = langId;
	}

	public String getLangId(){
		return langId;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}
}