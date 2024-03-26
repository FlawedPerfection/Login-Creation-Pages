package com.communion.registration.model;

public class Post {

	private int postId; 
	private String postTitle; 
	private String postContent; 
	
	 public Post(int postId, String title, String postContent) {
			// TODO Auto-generated constructor stub
	    	this.setPostId(postId);
	    	this.postTitle = postTitle;
	    	this.postContent = postContent;
		}

	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getTitle() {
		return postTitle;
	}
	public void setTitles(String title) {
		this.postTitle = title;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}