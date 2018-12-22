package com.bs.admin.pojo;

public class Message {

	private Integer messageId;
	private String messageInfo;
	private Integer bookId;
	private String username;
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	public String getMessageInfo() {
		return messageInfo;
	}
	public void setMessageInfo(String messageInfo) {
		this.messageInfo = messageInfo;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", messageInfo=" + messageInfo + ", bookId=" + bookId + ", username="
				+ username + "]";
	}
	
	public Message(Integer messageId, String messageInfo, Integer bookId, String username) {
		this.messageId = messageId;
		this.messageInfo = messageInfo;
		this.bookId = bookId;
		this.username = username;
	}
	public Message() {
	}
	
	
}
