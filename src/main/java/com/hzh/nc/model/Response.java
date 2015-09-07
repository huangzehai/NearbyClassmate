package com.hzh.nc.model;

public class Response {
	private boolean isSuccess;
	private String messsage;
	public static final Response SUCCESS=new Response(true,"Success");
	public static final Response FAIL=new Response(true,"Success");

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getMesssage() {
		return messsage;
	}

	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}

	public Response(boolean isSuccess, String messsage) {
		super();
		this.isSuccess = isSuccess;
		this.messsage = messsage;
	}

	@Override
	public String toString() {
		return "Response [isSuccess=" + isSuccess + ", messsage=" + messsage + "]";
	}

}
