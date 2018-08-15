package com.yc.bean;

import java.io.Serializable;
import java.util.Map;

public class JsonModel implements Serializable {
	
	

	private static final long serialVersionUID = -6619653602262734182L;
	
	private Integer code;   
	private String msg;
	private Map<String, Object> obj;
	private String url;		//页面错误将跳转至哪个网页
	
	
	@Override
	public String toString() {
		return "JsonModel [code=" + code + ", msg=" + msg + ", obj=" + obj
				+ ", url=" + url + "]";
	}
	
	public Map<String, Object> getObj() {
		return obj;
	}

	public void setObj(Map<String, Object> obj) {
		this.obj = obj;
	}

	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	
	

}
