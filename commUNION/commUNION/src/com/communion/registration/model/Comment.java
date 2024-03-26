package com.communion.registration.model;

public class Comment extends IdEntity {
	private int commentId; 
	private String commentContent;
	private int byId; 
	

	public int getcommentId() {
		return commentId;
	}
	public void setcommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getcommentContent() {
		return commentContent;
	}
	public void setcContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public int getById() {
		return byId;
	}
	public void setById(int byId) {
		this.byId = byId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}


