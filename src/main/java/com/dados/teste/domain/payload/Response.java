package com.dados.teste.domain.payload;

public class Response {
	public int  cod;
	public String message;
	
	public Response() {
	}
	
	public Response(int cod, String message) {
		this.cod = cod;
		this.message = message;
	}
	
	public void setParamns(int cod, String message) {
		this.cod = cod;
		this.message = message;
		
	}
}
