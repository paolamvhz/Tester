package com.tester.app.model;

public class Comment {
	
	private int 	comment_id;
	  private String comment;
	  private int  product_id;
	  private int  video_id;
	  private String god_bad;
	  

public int getComment_id() {
		return comment_id;
	}
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getVideo_id() {
		return video_id;
	}
	public void setVideo_id(int video_id) {
		this.video_id = video_id;
	}
	public String getGod_bad() {
		return god_bad;
	}
	public void setGod_bad(String god_bad) {
		this.god_bad = god_bad;
	}

  
	  
@Override
	public String toString() {
		return "Comment [comment_id=" + comment_id + ", comment=" + comment + ", product_id=" + product_id
				+ ", video_id=" + video_id + ", god_bad=" + god_bad + "]";
	}
  

}
