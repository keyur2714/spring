package com.spring.model;

public class Message {
	
	private Integer messageId;
	private String message;
	 
	/*public Message(Integer messageId, String message) {
		super();
		this.messageId = messageId;
		this.message = message;
	}*/
	
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
